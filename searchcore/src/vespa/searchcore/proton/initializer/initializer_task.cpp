// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.

#include "initializer_task.h"

namespace proton::initializer {

InitializerTask::InitializerTask()
    : _state(State::BLOCKED),
      _dependencies()
{
}


InitializerTask::~InitializerTask()
{
}


void
InitializerTask::addDependency(SP dependency)
{
    _dependencies.emplace_back(std::move(dependency));
}

} // namespace proton::initializer


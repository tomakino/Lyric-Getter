package cn.lyric.getter.hook.app

import cn.lyric.getter.hook.BaseHook
import cn.lyric.getter.tool.HookTools

object MobileMusic : BaseHook() {

    override fun init() {
        HookTools.MockFlyme().mock().notificationLyric()
    }
}
package com.google.android.gms.cast.framework.media.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap map = new HashMap();
        cy30.v(2131231140, map, "smallIconDrawableResId", 2131231141, "stopLiveStreamDrawableResId");
        cy30.v(2131231133, map, "pauseDrawableResId", 2131231134, "playDrawableResId");
        cy30.v(2131231138, map, "skipNextDrawableResId", 2131231139, "skipPrevDrawableResId");
        cy30.v(2131231129, map, "forwardDrawableResId", 2131231130, "forward10DrawableResId");
        cy30.v(2131231131, map, "forward30DrawableResId", 2131231135, "rewindDrawableResId");
        cy30.v(2131231136, map, "rewind10DrawableResId", 2131231137, "rewind30DrawableResId");
        cy30.v(2131231128, map, "disconnectDrawableResId", 2131165456, "notificationImageSizeDimenResId");
        cy30.v(2131953456, map, "castingToDeviceStringResId", 2131953491, "stopLiveStreamStringResId");
        cy30.v(2131953482, map, "pauseStringResId", 2131953483, "playStringResId");
        cy30.v(2131953488, map, "skipNextStringResId", 2131953489, "skipPrevStringResId");
        cy30.v(2131953470, map, "forwardStringResId", 2131953471, "forward10StringResId");
        cy30.v(2131953472, map, "forward30StringResId", 2131953484, "rewindStringResId");
        cy30.v(2131953485, map, "rewind10StringResId", 2131953486, "rewind30StringResId");
        map.put("disconnectStringResId", 2131953460);
        a = Collections.unmodifiableMap(map);
    }

    public static Integer findResourceByName(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) a.get(str);
    }
}

package p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class mjx {
    public static final Map a = sqg0.J(new mmr0[]{new mmr0("AD_FREE", 2131231335), new mmr0("DOWNLOAD", 2131231761), new mmr0("SHUFFLE", 2131232592), new mmr0("HEADPHONES", 2131231963), new mmr0("GROUP", 2131231940), new mmr0("ENHANCE_ACTIVE", 2131231789), new mmr0("QUEUE", 2131231362), new mmr0("CHECK", 2131231565), new mmr0("UNLOCK_ACTIVE", 2131232833), new mmr0("USER_ACTIVE", 2131232843), new mmr0("AUDIOBOOK", 2131231471), new mmr0("GROUP_SESSION", 2131231945), new mmr0("GROUP_ACTIVE", 2131231942), new mmr0("DUO_ACTIVE", 2131233772), new mmr0("LOCK_ACTIVE", 2131232115), new mmr0("STAR", 2131232677), new mmr0("Video", 2131232859), new mmr0("Soundwave", 2131232659)});
    public static final Map b = sqg0.J(new mmr0[]{new mmr0("AD_FREE", 2131231334), new mmr0("DOWNLOAD", 2131231760), new mmr0("SHUFFLE", 2131232591), new mmr0("HEADPHONES", 2131231962), new mmr0("GROUP", 2131231939), new mmr0("ENHANCE_ACTIVE", 2131231788), new mmr0("QUEUE", 2131231361), new mmr0("CHECK", 2131231564), new mmr0("UNLOCK_ACTIVE", 2131232832), new mmr0("USER_ACTIVE", 2131232842), new mmr0("AUDIOBOOK", 2131231470), new mmr0("GROUP_SESSION", 2131231944), new mmr0("GROUP_ACTIVE", 2131231941), new mmr0("DUO_ACTIVE", 2131233771), new mmr0("LOCK_ACTIVE", 2131232114), new mmr0("STAR", 2131232676), new mmr0("Video", 2131232858), new mmr0("Soundwave", 2131232658)});

    public static Drawable a(Resources resources, String str, boolean z) {
        Map map = z ? a : b;
        int iIntValue = z ? 2131231565 : 2131231564;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        }
        ThreadLocal threadLocal = qx21.a;
        return resources.getDrawable(iIntValue, null);
    }
}

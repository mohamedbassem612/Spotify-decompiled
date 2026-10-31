package p;

import android.media.MediaRoute2Info;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ig {
    public static void a(wmy wmyVar, MediaRoute2Info mediaRoute2Info) {
        List<Set> requiredPermissions = mediaRoute2Info.getRequiredPermissions();
        wmyVar.e = new ArrayList();
        for (Set set : requiredPermissions) {
            List list = (List) wmyVar.e;
            HashSet hashSet = new HashSet(set.size());
            for (Object obj : set) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
            list.add(Collections.unmodifiableSet(hashSet));
        }
    }

    public static void b(MediaRoute2Info.Builder builder, gvh0 gvh0Var) {
        builder.setRequiredPermissions(gvh0Var.c);
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
    }
}

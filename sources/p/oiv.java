package p;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oiv implements niv {
    public final Object a;

    public oiv(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static oiv d(w2d w2dVar) {
        DynamicRangeProfiles dynamicRangeProfiles;
        int i = Build.VERSION.SDK_INT;
        oiv oivVar = null;
        if (i >= 33 && (dynamicRangeProfiles = (DynamicRangeProfiles) w2dVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) != null) {
            boolean z = false;
            o0c.q("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            oivVar = new oiv(new oiv(dynamicRangeProfiles), z);
        }
        return oivVar == null ? piv.a : oivVar;
    }

    public static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long jLongValue = l.longValue();
            liv livVar = (liv) miv.a.get(l);
            o0c.p(livVar, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(livVar);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // p.niv
    public DynamicRangeProfiles a() {
        return (DynamicRangeProfiles) this.a;
    }

    @Override // p.niv
    public Set b(liv livVar) {
        Object obj = this.a;
        Long lA = miv.a(livVar, (DynamicRangeProfiles) obj);
        o0c.k("DynamicRange is not supported: " + livVar, lA != null);
        return e(((DynamicRangeProfiles) obj).getProfileCaptureRequestConstraints(lA.longValue()));
    }

    @Override // p.niv
    public Set c() {
        return e(((DynamicRangeProfiles) this.a).getSupportedProfiles());
    }

    public void f(Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        if (Build.VERSION.SDK_INT < 33 || (resolveInfoResolveActivity = ((PackageManager) this.a).resolveActivity(intent, PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH))) == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return;
        }
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
    }

    public /* synthetic */ oiv(Object obj, boolean z) {
        this.a = obj;
    }
}

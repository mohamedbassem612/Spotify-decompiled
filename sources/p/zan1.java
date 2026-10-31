package p;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zan1 {
    public final g2o1 a;

    public zan1(g2o1 g2o1Var) {
        this.a = g2o1Var;
    }

    public final synchronized void a(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) zzbk.zzd(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }
}

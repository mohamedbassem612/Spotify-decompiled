package p;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yds {
    public final Context a;
    public final Object b;
    public Object c;

    public yds(Context context) {
        this.a = context;
        this.b = new ComponentName(context, SpotifyMediaRouteProviderService.class.getName());
        this.c = new ComponentName(context, (Class<?>) MediaTransferReceiver.class);
    }

    public void a() {
        ((ComponentName) this.b).getShortClassName();
        d(2);
    }

    public void b() {
        ((ComponentName) this.b).getClassName();
        d(1);
    }

    public void c(List list) {
        Objects.toString(list);
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            if (i < 33) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mmr0 mmr0Var = (mmr0) it.next();
                    context.getPackageManager().setComponentEnabledSetting((ComponentName) mmr0Var.a, ((Number) mmr0Var.b).intValue(), 1);
                }
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            List<mmr0> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (mmr0 mmr0Var2 : list2) {
                ComponentName componentName = (ComponentName) mmr0Var2.a;
                int iIntValue = ((Number) mmr0Var2.b).intValue();
                rqb.e();
                arrayList.add(new PackageManager.ComponentEnabledSetting(componentName, iIntValue, 1));
            }
            packageManager.setComponentEnabledSettings(arrayList);
        } catch (SecurityException e) {
            Logger.e(e, "Failed to set components " + list, new Object[0]);
        } catch (Exception e2) {
            Logger.e(e2, "Failed to set components " + list, new Object[0]);
        }
    }

    public void d(int i) {
        ComponentName componentName = (ComponentName) this.b;
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName2 = (ComponentName) this.c;
        if (!f46.S0(new Integer[]{0, 1}).contains(Integer.valueOf(packageManager.getComponentEnabledSetting(componentName2)))) {
            Logger.d("MediaTransferReceiver is not in default state(AndroidManifest) or enabled", new Object[0]);
            c(Collections.singletonList(new mmr0(componentName2, 1)));
        }
        if (context.getPackageManager().getComponentEnabledSetting(componentName) == i) {
            return;
        }
        c(Collections.singletonList(new mmr0(componentName, Integer.valueOf(i))));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00a4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public p.gln1 e(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yds.e(java.lang.String):p.gln1");
    }

    public yds(Application application, x15 x15Var) {
        this.a = application;
        this.b = x15Var;
    }
}

package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5p0 {
    public final ArrayList a;

    public e5p0(ynb0 ynb0Var, ynb0 ynb0Var2, boolean z, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, mr4 mr4Var, ym4 ym4Var) {
        Set setS0 = f46.S0(new d5p0[]{new d5p0("SleepTimerNudge", ynb0Var, true), new d5p0("KidsModeNudge", ynb0Var2, z), new d5p0("RemoteVolumeWidgetPlugin", ynb0Var3, true), new d5p0("NpvActivityVolumeSmartControlPlugin", ynb0Var4, true), new d5p0("AudiobookProgressNudgePlugin", ynb0Var5, true), new d5p0("EmbeddedAdNpvPlugin", ynb0Var6, true), new d5p0("BannerSessionNavigationPlugin", ynb0Var7, true), new d5p0("LyricsOnNpvVisibilityPlugin", ynb0Var8, true), new d5p0("VideoManifestPrefetchPlugin", ynb0Var9, ym4Var.a()), new d5p0("AgentNowPlayingActivityUi", ynb0Var10, mr4Var.n()), new d5p0("AgeAssuranceBlockingPlugin", ynb0Var11, true)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : setS0) {
            if (((d5p0) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ynb0 ynb0Var12 = ((d5p0) it.next()).b;
            if (ynb0Var12 == null) {
                hhg1.n("Required value was null.");
                throw null;
            }
            arrayList2.add(ynb0Var12);
        }
        this.a = arrayList2;
    }
}

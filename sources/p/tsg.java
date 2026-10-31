package p;

import com.spotify.coremediarenderer.bridge.PlaybackRegistrationListener;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tsg implements PlaybackRegistrationListener, AutoCloseable {
    public final wtg a;
    public final ntg b;
    public final llm c;
    public final LinkedHashSet d = new LinkedHashSet();
    public String e;
    public volatile boolean f;
    public final xab1 g;
    public final xab1 h;

    public tsg(wtg wtgVar, ntg ntgVar, mr20 mr20Var, xe01 xe01Var, llm llmVar) {
        this.a = wtgVar;
        this.b = ntgVar;
        this.c = llmVar;
        lnm lnmVar = null;
        this.g = fn31.T(llmVar, (o8n) null, 0, new bag(mr20Var, this, lnmVar, (byte) 7), 3);
        this.h = fn31.T(llmVar, (o8n) null, 0, new bag(xe01Var, this, lnmVar, (byte) 6), 3);
    }

    public final void a(Function0 function0) {
        if (this.f) {
            return;
        }
        fn31.T(this.c, (o8n) null, 0, new pid(this, function0, (lnm) null, (byte) 21), 3);
    }

    public final void c(boolean z) {
        String str = this.e;
        LinkedHashSet linkedHashSet = this.d;
        if (str == null || !linkedHashSet.contains(str)) {
            str = null;
        }
        Set setP1 = o7h.p1(linkedHashSet);
        ntg ntgVar = this.b;
        if (ntgVar.X) {
            return;
        }
        Set setV0 = dm61.v0(ntgVar.i, setP1);
        Set set = setV0;
        ntgVar.e.keySet().removeAll(set);
        ntgVar.f.keySet().removeAll(set);
        ntgVar.g.keySet().removeAll(set);
        qka qkaVar = ntgVar.b;
        Iterator it = setV0.iterator();
        while (it.hasNext()) {
            qkaVar.invoke(it.next());
        }
        ntgVar.i = setP1;
        ntgVar.t = str;
        ntgVar.c(z);
        Iterator it2 = ntgVar.i.iterator();
        while (it2.hasNext()) {
            ntgVar.a((String) it2.next());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.g.d((CancellationException) null);
        this.h.d((CancellationException) null);
        fn31.T(this.c, (o8n) null, 0, new hzb(this, (lnm) null, (byte) 11), 3);
    }

    public final void onActiveSubtitleChanged(String str, String str2, boolean z) {
        if (this.f) {
            return;
        }
        this.a.onActiveSubtitleChanged(str, str2, z);
    }

    public final void onDisplaySleepPreventionActiveChanged(String str, boolean z) {
        if (this.f) {
            return;
        }
        this.a.onDisplaySleepPreventionActiveChanged(str, z);
        if (z) {
            a(new rsg(str, this));
        }
    }

    public final void onPlaybackRegistered(String str, String str2, String str3, String str4, String str5) {
        if (this.f) {
            return;
        }
        this.a.onPlaybackRegistered(str, str2, str3, str4, str5);
        a(new rsg(this, str, (byte) 1));
    }

    public final void onPlaybackUnregistered(String str) {
        if (this.f) {
            return;
        }
        this.a.onPlaybackUnregistered(str);
        a(new rsg(this, str, (byte) 2));
    }

    public final void onSubtitleCueChanged(String str, String str2, int[] iArr, int[] iArr2, String[] strArr, int i, double d, int i2, double d2, double d3) {
        if (this.f) {
            return;
        }
        this.a.onSubtitleCueChanged(str, str2, iArr, iArr2, strArr, i, d, i2, d2, d3);
    }

    public final void onSubtitleTracksAvailable(String str, String[] strArr, int[] iArr) {
        if (this.f) {
            return;
        }
        this.a.onSubtitleTracksAvailable(str, strArr, iArr);
    }
}

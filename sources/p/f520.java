package p;

import com.spotify.download.esperanto.proto.EsDownload;
import io.reactivex.rxjava3.core.Scheduler;
import java.net.URL;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f520 {
    public final ptu a;
    public final e520 b;
    public final URL c;
    public final String d;
    public final String e;
    public Long f = null;
    public final g520 g;
    public final boolean h;
    public final Scheduler i;
    public Integer j;

    public f520(ptu ptuVar, e520 e520Var, URL url, String str, String str2, g520 g520Var, boolean z, Scheduler scheduler) {
        this.a = ptuVar;
        this.b = e520Var;
        this.c = url;
        this.d = str;
        this.e = str2;
        this.g = g520Var;
        this.h = z;
        this.i = scheduler;
    }

    public final void a() {
        Integer num = this.j;
        if (num != null) {
            int iIntValue = num.intValue();
            try {
                fxu fxuVar = this.b;
                ptu ptuVar = fxuVar.a;
                ymz ymzVarO = EsDownload.FileStreamerId.o();
                ymzVarO.n(iIntValue);
                ptuVar.callSingle("spotify.download.esperanto.proto.Download", "DestroyFileStreamer", ymzVarO.build()).map(pzs0.Z0).subscribe(fcc.c1, fcc.d1, fxuVar.d);
            } finally {
                this.j = null;
            }
        }
    }

    public final void finalize() {
        a();
    }
}

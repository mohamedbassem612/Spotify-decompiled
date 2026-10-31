package androidx.work;

import android.content.Context;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.awe;
import p.fc11;
import p.g9n;
import p.gaa0;
import p.ilo1;
import p.lnm;
import p.mx;
import p.op71;
import p.pzc;
import p.q8n;
import p.u890;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lp/z8d0;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/g9n", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class CoroutineWorker extends z8d0 {
    public final WorkerParameters e;
    public final g9n f;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = g9n.c;
    }

    @Override // p.z8d0
    public final pzc a() {
        q8n q8nVarG = g();
        gaa0 gaa0VarF = op71.f();
        q8nVarG.getClass();
        return fc11.R(ilo1.B(q8nVarG, gaa0VarF), new awe(this, (lnm) null, (byte) 27));
    }

    @Override // p.z8d0
    public final void c() {
    }

    @Override // p.z8d0
    public final pzc d() {
        q8n q8nVarG = !u890.j(g(), g9n.c) ? g() : this.e.e;
        q8nVarG.getClass();
        return fc11.R(q8nVarG.y(op71.f()), new mx(this, null, (byte) 12));
    }

    public abstract Object f(lnm lnmVar);

    public q8n g() {
        return this.f;
    }

    public Object h() {
        throw new IllegalStateException("Not implemented");
    }
}

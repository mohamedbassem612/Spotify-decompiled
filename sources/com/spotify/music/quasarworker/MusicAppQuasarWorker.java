package com.spotify.music.quasarworker;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.serviceapi.android.quasarworker.QuasarWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.d9n;
import p.f4i1;
import p.gvg;
import p.hhp0;
import p.i0n0;
import p.l4f0;
import p.oo70;
import p.pew0;
import p.pze0;
import p.rih1;
import p.s45;
import p.v8d0;
import p.w8d0;
import p.wo70;
import p.x8d0;
import p.y8d0;
import p.zle1;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "", "ScopeContext", "Lcom/spotify/serviceapi/android/quasarworker/QuasarWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/zvl1;", "workManagerExecutionTracker", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/zvl1;)V", "src_main_java_com_spotify_music_quasarworker-quasarworker"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class MusicAppQuasarWorker<ScopeContext> extends QuasarWorker<ScopeContext> {
    public final WorkerParameters k;
    public final zvl1 l;
    public long m;

    public /* synthetic */ MusicAppQuasarWorker(Context context, WorkerParameters workerParameters, zvl1 zvl1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            hhp0 hhp0Var = hhp0.a;
            zvl1Var = new zvl1();
        }
        this(context, workerParameters, zvl1Var);
    }

    /* JADX INFO: renamed from: A */
    public abstract oo70 getN();

    public abstract i0n0 B();

    /* JADX INFO: renamed from: C */
    public abstract zle1 getF3p();

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long i() {
        return ((s45) getF3p()).a.a.e() / 1000;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final void q() {
        long jI = i() - this.m;
        Logger.b("QuasarWorker [" + getT() + "]: Cancelled (ran for " + jI + " sec)", new Object[0]);
        this.l.b();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final void r(y8d0 y8d0Var) {
        String str;
        int i;
        long jI = i() - this.m;
        boolean z = y8d0Var instanceof x8d0;
        if (z) {
            str = "Success";
        } else if (y8d0Var instanceof w8d0) {
            str = "Retry";
        } else {
            str = y8d0Var instanceof v8d0 ? "Failure" : "Invalid Result";
        }
        Logger.b(pze0.h(jI, " sec)", gvg.n("QuasarWorker [", getT(), "]: completed with ", str, " (ran for ")), new Object[0]);
        if (z) {
            i = 1;
        } else {
            i = y8d0Var instanceof w8d0 ? 2 : 3;
        }
        this.l.c(i);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public void s(int i) {
        Logger.b(gvg.j(gvg.n("QuasarWorker [", getT(), "]: ended.", System.lineSeparator(), "Stop reason: "), i, " (WorkInfo constant)"), new Object[0]);
        if (Build.VERSION.SDK_INT < 31 && !b()) {
            i = -256;
        }
        this.l.d(i);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public void t(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception message unavailable";
        }
        Logger.b(pze0.h(i() - this.m, " sec)", gvg.n("QuasarWorker [", getT(), "]: Exception, ", message, " (ran for ")), new Object[0]);
        this.l.e(exc);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public void u() {
        Logger.b(f4i1.f("QuasarWorker [", getT(), "]: started"), new Object[0]);
        this.m = i();
        String strO = getT();
        String name = getClass().getName();
        WorkerParameters workerParameters = this.k;
        String string = workerParameters.a.toString();
        this.l.f(strO, name, workerParameters.c, string);
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final Object v(pew0 pew0Var) {
        Logger.b(f4i1.f("QuasarWorker [", getT(), "]: releasing Quasar"), new Object[0]);
        Object objH = ((wo70) getN()).h(B(), pew0Var);
        return objH == d9n.a ? objH : rih1.a;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final Object y(l4f0 l4f0Var) {
        Logger.b(f4i1.f("QuasarWorker [", getT(), "]: waking up Quasar"), new Object[0]);
        Object objB = ((wo70) getN()).b(B(), l4f0Var);
        return objB == d9n.a ? objB : rih1.a;
    }

    public MusicAppQuasarWorker(Context context, WorkerParameters workerParameters, zvl1 zvl1Var) {
        super(context, workerParameters);
        this.k = workerParameters;
        this.l = zvl1Var;
    }
}

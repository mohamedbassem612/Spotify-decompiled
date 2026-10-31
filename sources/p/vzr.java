package p;

import com.spotify.mobius.Connectable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vzr implements f4h1, ihr0 {
    public final ab20 b;
    public final whp c;
    public final k8m0 d;
    public final Object h;
    public final /* synthetic */ byte a = 1;
    public final vku e = new vku();
    public final PublishSubject f = new PublishSubject();
    public final PublishSubject g = new PublishSubject();

    public vzr(ab20 ab20Var, whp whpVar, k8m0 k8m0Var, wzr wzrVar) {
        this.b = ab20Var;
        this.c = whpVar;
        this.d = k8m0Var;
        this.h = wzrVar;
    }

    public final boolean b(ehr0 ehr0Var) {
        byte b = this.a;
        wo3 wo3Var = wo3.a;
        PublishSubject publishSubject = this.f;
        switch (b) {
            case 0:
                if (!(ehr0Var instanceof qy3)) {
                    return false;
                }
                publishSubject.onNext(wo3Var);
                return true;
            default:
                if (!(ehr0Var instanceof qy3)) {
                    return false;
                }
                publishSubject.onNext(wo3Var);
                return true;
        }
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.h;
        switch (b) {
            case 0:
                return ((wzr) obj).h;
            default:
                return ((k1t) obj).t;
        }
    }

    public final void start() {
        byte b = this.a;
        whp whpVar = this.c;
        PublishSubject publishSubject = this.f;
        Object obj = this.h;
        k8m0 k8m0Var = this.d;
        PublishSubject publishSubject2 = this.g;
        vku vkuVar = this.e;
        switch (b) {
            case 0:
                vkuVar.b(new Disposable[]{publishSubject2.map(rbc.X0).distinctUntilChanged().subscribe(new uzr(this, (byte) 0)), publishSubject2.map(uwg.Z0).distinctUntilChanged().subscribe(new uzr(this, (byte) 1))});
                wzr wzrVar = (wzr) obj;
                vkuVar.a(k8m0Var.k(new r1k(new Connectable[]{wzrVar, new g8l(publishSubject, publishSubject2)}, (byte) 0), (ObservableTransformer) ((idd1) whpVar.a(wzrVar).e).getValue()));
                break;
            default:
                vkuVar.b(new Disposable[]{publishSubject2.map(ns80.b1).distinctUntilChanged().subscribe(new i1t(this, (byte) 0)), publishSubject2.map(bya0.X0).distinctUntilChanged().subscribe(new i1t(this, (byte) 1))});
                k1t k1tVar = (k1t) obj;
                vkuVar.a(k8m0Var.k(new r1k(new Connectable[]{k1tVar, new g8l(publishSubject, publishSubject2)}, (byte) 0), (ObservableTransformer) ((idd1) whpVar.a(k1tVar).e).getValue()));
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        vku vkuVar = this.e;
        switch (b) {
            case 0:
                vkuVar.c();
                break;
            default:
                vkuVar.c();
                break;
        }
    }

    public vzr(ab20 ab20Var, whp whpVar, k8m0 k8m0Var, k1t k1tVar) {
        this.b = ab20Var;
        this.c = whpVar;
        this.d = k8m0Var;
        this.h = k1tVar;
    }
}

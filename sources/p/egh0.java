package p;

import androidx.media3.common.PlaybackException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class egh0 implements o8u0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ egh0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void H(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w6e0 w6e0Var = (w6e0) obj;
                if (i == 3 && u890.j((dgh0) w6e0Var.b, cgh0.a)) {
                    w6e0Var.b = new agh0(false);
                    w6e0Var.j();
                    break;
                }
                break;
            default:
                lkw0 lkw0Var = (lkw0) obj;
                ww81 ww81Var = lkw0Var.c;
                u19 u19Var = lkw0Var.o;
                if (u19Var != null) {
                    boolean z = i == 3;
                    boolean z2 = i == 2;
                    boolean z3 = i == 4;
                    spq0 spq0Var = u19Var.d;
                    ww81Var.getClass();
                    Long l = (Long) spq0Var.e(Long.valueOf(ww81Var.getDuration()));
                    long jLongValue = l.longValue();
                    ww81Var.getClass();
                    long jMin = Math.min(ww81Var.v(), jLongValue);
                    if (z) {
                        lkw0Var.l.b(new FlowableSingleSingle(new FlowableTake(lkw0Var.b.J(new qpp0((byte) 22)))).flatMapCompletable(new dkw0(lkw0Var)).subscribe(new ikw0(this, u19Var, jLongValue)));
                    }
                    BehaviorSubject behaviorSubject = lkw0Var.k;
                    w19 w19Var = w19.h;
                    v19 v19Var = new v19();
                    String str = u19Var.a;
                    if (str == null) {
                        bhn0.i("Null previewId");
                    } else {
                        v19Var.a = str;
                        String str2 = (String) u19Var.b.e("");
                        if (str2 == null) {
                            bhn0.i("Null previewKey");
                        } else {
                            v19Var.b = str2;
                            v19Var.c = z2;
                            byte b2 = (byte) (v19Var.h | 1);
                            v19Var.d = false;
                            v19Var.h = (byte) (b2 | 2);
                            if (!z3) {
                                jLongValue = jMin;
                            }
                            v19Var.e = Long.valueOf(jLongValue);
                            v19Var.f = l;
                            v19Var.g = Long.valueOf(lkw0Var.h.c());
                            behaviorSubject.onNext(v19Var.a());
                            if (z3) {
                                lkw0Var.h(true, true);
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public final void n(PlaybackException playbackException) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w6e0 w6e0Var = (w6e0) obj;
                dgh0 dgh0Var = (dgh0) w6e0Var.b;
                if (!u890.j(dgh0Var, cgh0.a) && !(dgh0Var instanceof agh0)) {
                    if (!(dgh0Var instanceof zfh0) && !u890.j(dgh0Var, bgh0.a)) {
                        eg.o();
                        break;
                    }
                } else {
                    w6e0Var.b = new zfh0(false);
                    w6e0Var.j();
                    break;
                }
                break;
            default:
                Logger.e(playbackException, "Error playing preview", new Object[0]);
                lkw0 lkw0Var = (lkw0) obj;
                lkw0Var.k.onNext(w19.i);
                lkw0Var.h(true, true);
                break;
        }
    }
}

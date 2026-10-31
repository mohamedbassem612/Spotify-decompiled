package p;

import com.spotify.audio.record.AudioRecordingException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g38 {
    public final ghb a;
    public final phb b;
    public final u28 c;
    public final Scheduler d;
    public final xgn0 e = ygn0.a();
    public final AtomicReference f = new AtomicReference(null);
    public final cp5 g;
    public final AtomicReference h;
    public final z28 i;
    public final idd1 j;
    public final Subject k;
    public final yu3 l;

    public g38(o8q o8qVar, ghb ghbVar, phb phbVar, u28 u28Var, Scheduler scheduler) {
        this.a = ghbVar;
        this.b = phbVar;
        this.c = u28Var;
        this.d = scheduler;
        cp5 cp5Var = new cp5((byte) 24);
        this.g = cp5Var;
        this.h = new AtomicReference(null);
        this.i = o8qVar.a(new bv40(cp5Var, (byte) 22), u28Var, new f38(this, (byte) 0));
        this.j = new idd1(new i26(this, (byte) 20));
        this.k = BehaviorSubject.g(Boolean.FALSE).c();
        this.l = new yu3(this);
    }

    public final Flowable a() {
        try {
            return (Flowable) this.j.getValue();
        } catch (AudioRecordingException e) {
            int i = Flowable.a;
            return new FlowableError(Functions.h(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[PHI: r11
      0x0090: PHI (r11v9 p.vgn0) = (r11v5 p.vgn0), (r11v13 p.vgn0) binds: [B:40:0x008e, B:48:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:39:0x0084, B:42:0x0092, B:30:0x0067, B:32:0x006f), top: B:55:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:14:0x002f, B:46:0x00a6, B:49:0x00ac), top: B:57:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) throws Throwable {
        e38 e38Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        vgn0 vgn0Var3;
        List listA;
        Object objA;
        d38 d38Var;
        ihb ihbVar;
        if (onmVar instanceof e38) {
            e38Var = (e38) onmVar;
            int i2 = e38Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e38Var.f = i2 - Integer.MIN_VALUE;
            } else {
                e38Var = new e38(this, onmVar);
            }
        } else {
            e38Var = new e38(this, onmVar);
        }
        Object obj = e38Var.d;
        int i3 = e38Var.f;
        AtomicReference atomicReference = this.f;
        int i4 = 0;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                vgn0Var = this.e;
                e38Var.a = vgn0Var;
                e38Var.b = 0;
                e38Var.f = 1;
                if (vgn0Var.a(e38Var) != d9nVar) {
                    i = 0;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vgn0Var3 = e38Var.a;
                    try {
                        hm5.M(obj);
                        ihbVar = (ihb) obj;
                        if (ihbVar == null) {
                            vgn0Var = vgn0Var3;
                            d38Var = null;
                        } else {
                            d38Var = new d38(this, ihbVar);
                            atomicReference.set(d38Var);
                            vgn0Var = vgn0Var3;
                        }
                        vgn0Var.c((Object) null);
                        return d38Var;
                    } catch (Throwable th) {
                        th = th;
                        vgn0Var3.c((Object) null);
                        throw th;
                    }
                }
                i4 = e38Var.c;
                i = e38Var.b;
                vgn0Var2 = e38Var.a;
                try {
                    hm5.M(obj);
                    vgn0Var = vgn0Var2;
                    listA = this.a.a();
                    if (!listA.isEmpty()) {
                        phb phbVar = this.b;
                        e38Var.a = vgn0Var;
                        e38Var.b = i;
                        e38Var.c = i4;
                        e38Var.f = 3;
                        objA = phbVar.a(listA, e38Var);
                        if (objA != d9nVar) {
                            vgn0Var3 = vgn0Var;
                            obj = objA;
                            ihbVar = (ihb) obj;
                            if (ihbVar == null) {
                                vgn0Var = vgn0Var3;
                                d38Var = null;
                            } else {
                                d38Var = new d38(this, ihbVar);
                                atomicReference.set(d38Var);
                                vgn0Var = vgn0Var3;
                            }
                        }
                        return d9nVar;
                    }
                    d38Var = null;
                    vgn0Var.c((Object) null);
                    return d38Var;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var3 = vgn0Var2;
                    vgn0Var3.c((Object) null);
                    throw th;
                }
            }
            i = e38Var.b;
            vgn0 vgn0Var4 = e38Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var4;
            d38 d38Var2 = (d38) atomicReference.get();
            if (d38Var2 == null) {
                listA = this.a.a();
                if (!listA.isEmpty()) {
                    d38Var = null;
                } else {
                    phb phbVar2 = this.b;
                    e38Var.a = vgn0Var;
                    e38Var.b = i;
                    e38Var.c = i4;
                    e38Var.f = 3;
                    objA = phbVar2.a(listA, e38Var);
                    if (objA != d9nVar) {
                        vgn0Var3 = vgn0Var;
                        obj = objA;
                        ihbVar = (ihb) obj;
                        if (ihbVar == null) {
                            vgn0Var = vgn0Var3;
                            d38Var = null;
                        } else {
                            d38Var = new d38(this, ihbVar);
                            atomicReference.set(d38Var);
                            vgn0Var = vgn0Var3;
                        }
                    }
                }
                vgn0Var.c((Object) null);
                return d38Var;
            }
            e38Var.a = vgn0Var;
            e38Var.b = i;
            e38Var.c = 0;
            e38Var.f = 2;
            if (d38Var2.a(e38Var) != d9nVar) {
                vgn0Var2 = vgn0Var;
                vgn0Var = vgn0Var2;
                listA = this.a.a();
                if (!listA.isEmpty()) {
                    d38Var = null;
                } else {
                    phb phbVar3 = this.b;
                    e38Var.a = vgn0Var;
                    e38Var.b = i;
                    e38Var.c = i4;
                    e38Var.f = 3;
                    objA = phbVar3.a(listA, e38Var);
                    if (objA != d9nVar) {
                        vgn0Var3 = vgn0Var;
                        obj = objA;
                        ihbVar = (ihb) obj;
                        if (ihbVar == null) {
                            vgn0Var = vgn0Var3;
                            d38Var = null;
                        } else {
                            d38Var = new d38(this, ihbVar);
                            atomicReference.set(d38Var);
                            vgn0Var = vgn0Var3;
                        }
                    }
                }
                vgn0Var.c((Object) null);
                return d38Var;
            }
            return d9nVar;
        } catch (Throwable th3) {
            th = th3;
            vgn0Var3 = vgn0Var;
            vgn0Var3.c((Object) null);
            throw th;
        }
    }

    public final void c(boolean z) {
        this.k.onNext(Boolean.valueOf(z));
    }
}

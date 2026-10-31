package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i241 implements fxc {
    public final Type a;
    public final Scheduler b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public i241(Type type, Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = type;
        this.b = scheduler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    @Override // p.fxc
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054 A[RETURN] */
    @Override // p.fxc
    public final Object i(wyp0 wyp0Var) {
        jxc ilbVar;
        Scheduler scheduler;
        jxc ilbVar2 = this.c ? new ilb(wyp0Var, (byte) 1) : new jxc(wyp0Var, (byte) 0);
        if (!this.d) {
            if (this.e) {
                ilbVar = new ilb(ilbVar2, (byte) 0);
            }
            scheduler = this.b;
            if (scheduler != null) {
                ilbVar2 = ilbVar2.subscribeOn(scheduler);
            }
            if (this.f) {
                return ilbVar2.toFlowable(BackpressureStrategy.a);
            }
            if (this.g) {
                return ilbVar2.singleOrError();
            }
            if (this.h) {
                return ilbVar2.singleElement();
            }
            if (this.i) {
                return ilbVar2.ignoreElements();
            }
            return ilbVar2;
        }
        ilbVar = new jxc(ilbVar2, (byte) 1);
        ilbVar2 = ilbVar;
        scheduler = this.b;
        if (scheduler != null) {
            ilbVar2 = ilbVar2.subscribeOn(scheduler);
        }
        if (this.f) {
            return ilbVar2.toFlowable(BackpressureStrategy.a);
        }
        if (this.g) {
            return ilbVar2.singleOrError();
        }
        if (this.h) {
            return ilbVar2.singleElement();
        }
        if (this.i) {
            return ilbVar2.ignoreElements();
        }
        return ilbVar2;
    }
}

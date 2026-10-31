package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nh40 implements Iterator, ola0 {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    public nh40(qen0 qen0Var) {
        this.a = (byte) 2;
        this.d = qen0Var;
        this.b = -1;
        this.c = j2h1.A(new pen0(qen0Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.b;
        oh40 oh40Var = (oh40) this.d;
        if (i == -2) {
            objInvoke = ((Function0) oh40Var.b).invoke();
        } else {
            iu30 iu30Var = (iu30) oh40Var.c;
            Object obj = this.c;
            obj.getClass();
            objInvoke = iu30Var.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    public void b(int i) {
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            case 1:
                return ((r561) this.c).hasNext();
            case 2:
                return ((r561) this.c).hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    hhg1.k();
                    return null;
                }
                Object obj = this.c;
                this.b = -1;
                return obj;
            case 1:
                return ((r561) this.c).next();
            case 2:
                return ((r561) this.c).next();
            default:
                vu30 vu30Var = (vu30) ((oh40) this.d).c;
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return vu30Var.invoke(Integer.valueOf(i), ((Iterator) this.c).next());
                }
                p7h.T();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.b;
                if (i != -1) {
                    ((aen0) obj).b.h(i);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                if (i2 != -1) {
                    ((qen0) obj).b.m(i2);
                    this.b = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nh40(oh40 oh40Var) {
        this.a = (byte) 0;
        this.d = oh40Var;
        this.b = -2;
    }

    public nh40(oh40 oh40Var, byte b) {
        this.a = (byte) 3;
        this.d = oh40Var;
        this.c = ((n561) oh40Var.b).iterator();
    }

    public nh40(aen0 aen0Var) {
        this.a = (byte) 1;
        this.d = aen0Var;
        this.b = -1;
        this.c = j2h1.A(new zdn0(aen0Var, this, (lnm) null));
    }
}

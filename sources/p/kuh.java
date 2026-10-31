package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kuh implements Iterator {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public kuh(rpn1 rpn1Var) {
        this.e = rpn1Var;
        this.b = rpn1Var.e;
        this.c = rpn1Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.c >= 0;
            default:
                return this.c >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        Object objA = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                muh muhVar = (muh) abstractMap;
                if (muhVar.e != this.b) {
                    eg.d();
                } else if (!hasNext()) {
                    hhg1.k();
                } else {
                    int i = this.c;
                    this.d = i;
                    objA = a(i);
                    int i2 = this.c + 1;
                    this.c = i2 < muhVar.f ? i2 : -1;
                }
                break;
            default:
                rpn1 rpn1Var = (rpn1) abstractMap;
                if (rpn1Var.e != this.b) {
                    eg.d();
                } else if (!hasNext()) {
                    hhg1.k();
                } else {
                    int i3 = this.c;
                    this.d = i3;
                    objA = b(i3);
                    int i4 = this.c + 1;
                    this.c = i4 < rpn1Var.f ? i4 : -1;
                }
                break;
        }
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                muh muhVar = (muh) abstractMap;
                if (muhVar.e != this.b) {
                    eg.d();
                } else {
                    dm5.z(this.d >= 0, "no calls to next() since the last call to remove()");
                    this.b += 32;
                    int i = this.d;
                    Object obj = muh.t;
                    muhVar.remove(muhVar.k()[i]);
                    this.c--;
                    this.d = -1;
                }
                break;
            default:
                rpn1 rpn1Var = (rpn1) abstractMap;
                int i2 = rpn1Var.e;
                int i3 = this.b;
                if (i2 != i3) {
                    eg.d();
                } else {
                    int i4 = this.d;
                    if (!(i4 >= 0)) {
                        eg.m("no calls to next() since the last call to remove()");
                    } else {
                        this.b = i3 + 32;
                        rpn1Var.remove(rpn1Var.b()[i4]);
                        this.c--;
                        this.d = -1;
                    }
                }
                break;
        }
    }

    public kuh(muh muhVar) {
        this.e = muhVar;
        this.b = muhVar.e;
        this.c = muhVar.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}

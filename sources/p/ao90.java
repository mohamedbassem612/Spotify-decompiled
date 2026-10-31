package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ao90 extends mjh1 {
    public int b;
    public Object c;
    public final /* synthetic */ byte d;
    public final Iterator e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ao90(zl61 zl61Var) {
        this();
        this.d = (byte) 1;
        this.f = zl61Var;
        this.e = zl61Var.c.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean hasNext() {
        Object next;
        dm5.y(this.b != 4);
        int iC = l1d.C(this.b);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.b = 4;
            byte b = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (b) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((omv0) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((zl61) obj2).d.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.b = 3;
                            break;
                        } else {
                            next = it.next();
                            if (!((zl61) obj2).d.d.equals(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.c = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ao90(Iterator it, omv0 omv0Var) {
        this();
        this.d = (byte) 0;
        this.e = it;
        this.f = omv0Var;
    }

    public ao90() {
        super((byte) 0);
        this.b = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ao90(zl61 zl61Var, byte b) {
        this();
        this.d = (byte) 2;
        this.f = zl61Var;
        this.e = zl61Var.c.iterator();
    }
}

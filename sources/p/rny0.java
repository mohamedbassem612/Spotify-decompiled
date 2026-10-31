package p;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rny0 extends ko11 {
    public static final qny0[] b = new qny0[0];
    public final AtomicReference a = new AtomicReference(b);

    public final void a(qny0 qny0Var) {
        AtomicReference atomicReference;
        qny0[] qny0VarArr;
        qny0[] qny0VarArr2;
        do {
            atomicReference = this.a;
            qny0VarArr = (qny0[]) atomicReference.get();
            qny0VarArr2 = b;
            if (qny0VarArr == qny0VarArr2) {
                return;
            }
            int length = qny0VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qny0VarArr[i] == qny0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                qny0VarArr2 = new qny0[length - 1];
                System.arraycopy(qny0VarArr, 0, qny0VarArr2, 0, i);
                System.arraycopy(qny0VarArr, i + 1, qny0VarArr2, i, (length - i) - 1);
            }
        } while (!i3a.p(atomicReference, qny0VarArr, qny0VarArr2));
    }

    public final void accept(Object obj) {
        if (obj == null) {
            bhn0.i("value == null");
            return;
        }
        for (qny0 qny0Var : (qny0[]) this.a.get()) {
            if (!qny0Var.get()) {
                qny0Var.a.onNext(obj);
            }
        }
    }

    public final void subscribeActual(Observer observer) {
        AtomicReference atomicReference;
        qny0[] qny0VarArr;
        qny0[] qny0VarArr2;
        qny0 qny0Var = new qny0(observer, this);
        observer.onSubscribe(qny0Var);
        do {
            atomicReference = this.a;
            qny0VarArr = (qny0[]) atomicReference.get();
            int length = qny0VarArr.length;
            qny0VarArr2 = new qny0[length + 1];
            System.arraycopy(qny0VarArr, 0, qny0VarArr2, 0, length);
            qny0VarArr2[length] = qny0Var;
        } while (!i3a.p(atomicReference, qny0VarArr, qny0VarArr2));
        if (qny0Var.isDisposed()) {
            a(qny0Var);
        }
    }
}

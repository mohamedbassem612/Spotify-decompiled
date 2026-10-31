package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Predicate;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class AppendOnlyLinkedArrayList<T> {
    public final Object[] a;
    public Object[] b;
    public int c;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final boolean a(gnc1 gnc1Var) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.a) {
                    gnc1Var.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.ErrorNotification) {
                    gnc1Var.onError(((NotificationLite.ErrorNotification) obj).a);
                    return true;
                }
                if (obj instanceof NotificationLite.SubscriptionNotification) {
                    gnc1Var.onSubscribe(((NotificationLite.SubscriptionNotification) obj).a);
                } else {
                    gnc1Var.onNext(obj);
                }
            }
            objArr = objArr[4];
        }
    }

    public final void b(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }

    public final void c(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }
}

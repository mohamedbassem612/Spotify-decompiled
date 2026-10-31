package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.Objects;
import p.gnc1;
import p.pnc1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class NotificationLite {
    public static final NotificationLite a;
    public static final /* synthetic */ NotificationLite[] b;

    public static final class ErrorNotification implements Serializable {
        public final Throwable a;

        public ErrorNotification(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.a, ((ErrorNotification) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.a + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        a = notificationLite;
        b = new NotificationLite[]{notificationLite};
    }

    public static boolean a(Observer observer, Object obj) {
        if (obj == a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).a);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    public static boolean b(Object obj, gnc1 gnc1Var) {
        if (obj == a) {
            gnc1Var.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            gnc1Var.onError(((ErrorNotification) obj).a);
            return true;
        }
        gnc1Var.onNext(obj);
        return false;
    }

    public static boolean c(Observer observer, Object obj) {
        if (obj == a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).a);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).a);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    public static Object d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static Object e(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Throwable f(Object obj) {
        return ((ErrorNotification) obj).a;
    }

    public static boolean g(Object obj) {
        return obj == a;
    }

    public static boolean h(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static Object i(pnc1 pnc1Var) {
        return new SubscriptionNotification(pnc1Var);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}

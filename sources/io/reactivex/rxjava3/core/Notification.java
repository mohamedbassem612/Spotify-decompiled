package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Notification<T> {
    public static final Notification b = new Notification(null);
    public final Object a;

    public Notification(Object obj) {
        this.a = obj;
    }

    public static Notification a(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new Notification(NotificationLite.e(th));
    }

    public static Notification b(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        return new Notification(obj);
    }

    public final Throwable c() {
        Object obj = this.a;
        if (NotificationLite.h(obj)) {
            return NotificationLite.f(obj);
        }
        return null;
    }

    public final Object d() {
        Object obj = this.a;
        if (obj == null || NotificationLite.h(obj)) {
            return null;
        }
        return obj;
    }

    public final boolean e() {
        Object obj = this.a;
        return (obj == null || NotificationLite.h(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return Objects.equals(this.a, ((Notification) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.h(obj)) {
            return cy30.m("OnNextNotification[", obj, "]");
        }
        return "OnErrorNotification[" + NotificationLite.f(obj) + "]";
    }
}

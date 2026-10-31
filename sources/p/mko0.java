package p;

import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mko0 {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static mrs0 b(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Person) {
            return rh5.a((Person) parcelable);
        }
        return null;
    }

    public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}

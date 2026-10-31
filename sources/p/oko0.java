package p;

import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class oko0 {
    public static Parcelable a(Person person) {
        return person;
    }

    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j, person);
    }

    public static void c(Notification.MessagingStyle.Message message, Bundle bundle) {
        message.getExtras().putAll(bundle);
    }
}

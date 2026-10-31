package p;

import android.app.Notification;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nd30 extends hab0 implements Function0 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ hpq b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Notification d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd30(int i, Notification notification, Integer num, hpq hpqVar) {
        super(0);
        this.a = num;
        this.b = hpqVar;
        this.c = i;
        this.d = notification;
    }

    public final Object invoke() {
        Notification notification = this.d;
        int i = this.c;
        Integer num = this.a;
        hpq hpqVar = this.b;
        if (num != null) {
            hpqVar.startForeground(i, notification, num.intValue());
        } else {
            hpqVar.startForeground(i, notification);
        }
        return rih1.a;
    }
}

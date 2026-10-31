package p;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cko0 extends glo0 {
    public final /* synthetic */ byte e;
    public Object f;

    public cko0(byte b) {
        this.e = b;
        switch (b) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) fdcVar.d).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) fdcVar.d).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                Iterator it = ((ArrayList) this.f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // p.glo0
    public final String d() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        switch (this.e) {
            case 0:
                super.e(bundle);
                this.f = bundle.getCharSequence("android.bigText");
                break;
            default:
                super.e(bundle);
                ArrayList arrayList = (ArrayList) this.f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                }
                break;
        }
    }

    public void f(String str) {
        this.f = dko0.d(str);
    }

    public /* synthetic */ cko0(boolean z) {
        this.e = (byte) 0;
    }
}

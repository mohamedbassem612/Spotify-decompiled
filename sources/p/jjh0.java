package p;

import android.os.Parcelable;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class jjh0 implements Consumer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;

    public /* synthetic */ jjh0(MediaButtonReceiver mediaButtonReceiver, KeyEvent keyEvent, int i) {
        this.c = mediaButtonReceiver;
        this.d = keyEvent;
        this.b = i;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        slc0 slc0Var = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                MediaButtonReceiver mediaButtonReceiver = (MediaButtonReceiver) obj2;
                KeyEvent keyEvent = (KeyEvent) slc0Var;
                int i = MediaButtonReceiver.h;
                if (!((Boolean) obj).booleanValue()) {
                    Logger.b("Ignoring event because user is logged out.", new Object[0]);
                } else {
                    mediaButtonReceiver.a(this.b, keyEvent);
                }
                break;
            default:
                bjx bjxVar = (bjx) obj2;
                slc0 slc0Var2 = slc0Var;
                String str = (String) obj;
                pdl0 pdl0Var = (pdl0) bjxVar.e;
                int i2 = this.b;
                String str2 = i2 != 0 ? i2 != 1 ? "week_three_reminder" : "week_two_reminder" : "first_startup";
                x6h1 x6h1VarC = pdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("account_linking_dialog", (String) null, (Integer) null, (String) null, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                String str3 = ((i8h1) bjxVar.d).f(k7h1Var.a(), (Set) null).a.a;
                lvc lvcVar = (lvc) bjxVar.f;
                ((g1s0) bjxVar.c).getClass();
                lvcVar.b(i2, str3, "Samsung", str, slc0Var2);
                break;
        }
    }

    public /* synthetic */ jjh0(bjx bjxVar, int i, slc0 slc0Var) {
        this.c = bjxVar;
        this.b = i;
        this.d = slc0Var;
    }
}

package p;

import android.app.Application;
import android.app.UiModeManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zz40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Application b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz40(Application application) {
        super(0);
        this.b = application;
    }

    public final Object invoke() {
        byte b = this.a;
        Application application = this.b;
        switch (b) {
            case 0:
                return (UiModeManager) application.getSystemService("uimode");
            default:
                try {
                    PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 64);
                    if (packageInfo.signatures != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : packageInfo.signatures) {
                            int i = hu50.a;
                            cyi0 cyi0Var = fu50.a;
                            byte[] byteArray = signature.toByteArray();
                            cyi0Var.getClass();
                            int length = byteArray.length;
                            dm5.v(0, length, byteArray.length);
                            dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                            bmq0 bmq0VarM = cyi0Var.M();
                            bmq0VarM.U(byteArray, length);
                            arrayList.add(bmq0VarM.C().toString());
                        }
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (true) {
                                sb.append((CharSequence) next);
                                if (it.hasNext()) {
                                    sb.append((CharSequence) ":");
                                    next = it.next();
                                }
                            }
                        }
                        return sb.toString();
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Logger.h(e, "Failed to get the application signatures", new Object[0]);
                }
                return "";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz40(zym0 zym0Var, Application application) {
        super(0);
        this.b = application;
    }
}

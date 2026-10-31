package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sg40 implements acr0 {
    public final /* synthetic */ byte a;
    public final i5y0 b;
    public final Set c;

    public sg40(i5y0 i5y0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = i5y0Var;
                this.c = Collections.singleton(blc0.Va);
                break;
            default:
                this.b = i5y0Var;
                this.c = Collections.singleton(blc0.Ya);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.c;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ig40.class;
            default:
                return o4y0.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Object next;
        nmu0 nmu0Var;
        String str;
        ArrayList<String> stringArrayList;
        switch (this.a) {
            case 0:
                Bundle extras = intent.getExtras();
                pqr0 pqr0Var = extras != null ? (pqr0) jhc1.t(extras, "generation_mode_initial", pqr0.class) : null;
                nmu0 nmu0Var2 = pqr0Var != null ? pqr0Var.a : null;
                if (nmu0Var2 == null) {
                    Uri uri = s4b1Var.a;
                    String queryParameter = uri != null ? uri.getQueryParameter("generation_mode") : null;
                    Iterator it = nmu0.e.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            int iOrdinal = ((nmu0) next).ordinal();
                            if (iOrdinal == 0) {
                                str = "adds_new";
                            } else {
                                if (iOrdinal != 1) {
                                    eg.o();
                                    return null;
                                }
                                str = "replaces";
                            }
                        } else {
                            next = null;
                        }
                        nmu0Var = (nmu0) next;
                        if (nmu0Var == null) {
                            nmu0Var2 = nmu0.a;
                        } else {
                            nmu0Var2 = nmu0Var;
                        }
                    } while (!str.equals(queryParameter));
                    nmu0Var = (nmu0) next;
                    if (nmu0Var == null) {
                        nmu0Var2 = nmu0.a;
                    } else {
                        nmu0Var2 = nmu0Var;
                    }
                }
                Bundle extras2 = intent.getExtras();
                return new og40(nmu0Var2, extras2 != null ? (ResultReceiver) jhc1.t(extras2, "generation_mode_result_receiver", ResultReceiver.class) : null);
            default:
                Bundle extras3 = intent.getExtras();
                if (extras3 == null || (stringArrayList = extras3.getStringArrayList("error_messages")) == null) {
                    stringArrayList = z6x.a;
                }
                return new p4y0(stringArrayList);
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Bottom sheet to choose how a prompted playlist updates";
            default:
                return "Bottom sheet to show prompt errors";
        }
    }

    public final boolean isEnabled() {
        byte b = this.a;
        i5y0 i5y0Var = this.b;
        switch (b) {
            case 0:
                return i5y0Var.e() && i5y0Var.b.g();
            default:
                return i5y0Var.e();
        }
    }
}

package p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rh3 extends Handler {
    public final /* synthetic */ byte a = 0;
    public Object b;

    public rh3(ffl1 ffl1Var) {
        this.b = ffl1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                if (i2 == -3 || i2 == -2 || i2 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    break;
                } else if (i2 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                Bundle data = message.getData();
                ffl1 ffl1Var = (ffl1) this.b;
                boolean zI = ffl1Var.i();
                Objects.toString(data);
                int i3 = message.what;
                if (i3 != 502) {
                    if (i3 != 702) {
                        if (i3 != 709) {
                            if (i3 != 710) {
                                switch (i3) {
                                    case 704:
                                        if (zI) {
                                            ffl1Var.m(data.getInt("exitNumber"));
                                        }
                                        break;
                                    case 705:
                                        if (zI) {
                                            ffl1Var.j(data.getInt("distanceMeters"), data.getString("distanceString"));
                                        }
                                        break;
                                    case 706:
                                        if (zI) {
                                            ffl1Var.o(data.getBoolean("isLeftHandTraffic"));
                                        }
                                        break;
                                }
                            } else {
                                if (zI) {
                                    ffl1Var.l(data.getBoolean("isNavigating"));
                                }
                                break;
                            }
                        } else {
                            if (zI) {
                                data.getString("streetName");
                                ffl1Var.n();
                            }
                            break;
                        }
                    } else if (zI && (i = data.getInt("instruction")) >= 0 && i < xvj1._values().length) {
                        ffl1Var.k(xvj1._values()[i]);
                        break;
                    }
                } else {
                    ffl1Var.f(data == null ? 0 : data.getInt("reason"));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rh3() {
    }
}

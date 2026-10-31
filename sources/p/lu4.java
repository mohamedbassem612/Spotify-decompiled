package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lu4 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ lu4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                ((ssw0) this.b).l(rih1.a);
                return;
            case 1:
                ((n1r) this.b).invoke();
                return;
            case 2:
            case 3:
            default:
                super.onAvailable(network);
                return;
            case 4:
                b2b1 b2b1Var = (b2b1) this.b;
                synchronized (b2b1Var) {
                    if (!b2b1Var.c) {
                        d18 d18Var = b2b1Var.b;
                        synchronized (d18Var) {
                            if (!u890.j((Network) d18Var.c, network)) {
                                d18Var.c = network;
                                d18Var.a++;
                                ((LinkedHashMap) d18Var.b).clear();
                            }
                        }
                    }
                }
                return;
            case 5:
                ((ObservableEmitter) this.b).onNext(new v6o0(network));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 3:
                if (network.equals(((q8o0) this.b).f.getActiveNetwork())) {
                    qs10 qs10VarA = qs10.a();
                    int i = p8o0.a;
                    qs10VarA.getClass();
                    q8o0 q8o0Var = (q8o0) this.b;
                    Object objA = ((til) q8o0Var).e;
                    if (objA == null) {
                        objA = q8o0Var.a();
                    }
                    m8o0 m8o0Var = (m8o0) objA;
                    q8o0 q8o0Var2 = (q8o0) this.b;
                    synchronized (q8o0Var2.g) {
                        if (q8o0Var2.h == z) {
                            return;
                        }
                        q8o0Var2.h = z;
                        ((q8o0) this.b).b(new m8o0(m8o0Var.a, m8o0Var.b, m8o0Var.c, m8o0Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                ((n1r) this.b).invoke();
                break;
            case 2:
                qs10 qs10VarA = qs10.a();
                int i = mvl1.a;
                qs10VarA.getClass();
                ((gub0) this.b).invoke(mjl.a);
                break;
            case 3:
                qs10 qs10VarA2 = qs10.a();
                int i2 = p8o0.a;
                networkCapabilities.toString();
                qs10VarA2.getClass();
                q8o0 q8o0Var = (q8o0) this.b;
                q8o0Var.b(p8o0.a(q8o0Var.f, q8o0Var.h));
                break;
            case 4:
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
            case 5:
                ((ObservableEmitter) this.b).onNext(new z6o0(network, networkCapabilities));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                ((ssw0) this.b).l(rih1.a);
                return;
            case 1:
                ((n1r) this.b).invoke();
                return;
            case 2:
                qs10 qs10VarA = qs10.a();
                int i = mvl1.a;
                qs10VarA.getClass();
                ((gub0) this.b).invoke(new njl(7));
                return;
            case 3:
                qs10 qs10VarA2 = qs10.a();
                int i2 = p8o0.a;
                qs10VarA2.getClass();
                ((q8o0) this.b).b(new m8o0(false, false, false, false, false));
                return;
            case 4:
                b2b1 b2b1Var = (b2b1) this.b;
                synchronized (b2b1Var) {
                    if (!b2b1Var.c) {
                        d18 d18Var = b2b1Var.b;
                        synchronized (d18Var) {
                            if (u890.j((Network) d18Var.c, network)) {
                                d18Var.c = null;
                                d18Var.a++;
                                ((LinkedHashMap) d18Var.b).clear();
                            }
                        }
                    }
                }
                return;
            default:
                ((ObservableEmitter) this.b).onNext(new x7o0(network));
                return;
        }
    }

    public /* synthetic */ lu4(cv30 cv30Var, byte b) {
        this.a = b;
        this.b = cv30Var;
    }
}

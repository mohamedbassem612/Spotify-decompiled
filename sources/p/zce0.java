package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zce0 {
    public static final Object f = new Object();
    public static zce0 g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final nj7 e;

    public zce0(Context context) {
        this.a = context;
        this.e = new nj7(this, context.getMainLooper(), (byte) 3);
    }

    public static zce0 a(Context context) {
        zce0 zce0Var;
        synchronized (f) {
            try {
                zce0Var = g;
                if (zce0Var == null) {
                    zce0Var = new zce0(context.getApplicationContext());
                    g = zce0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zce0Var;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                yce0 yce0Var = new yce0(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(yce0Var);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(yce0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(Intent intent) {
        int iMatch;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        yce0 yce0Var = (yce0) arrayList.get(i);
                        if (z) {
                            Objects.toString(yce0Var.a);
                        }
                        if (!yce0Var.c && (iMatch = yce0Var.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(yce0Var);
                            yce0Var.c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((yce0) arrayList2.get(i2)).c = false;
                        }
                        this.d.add(new j2e0(intent, arrayList2, (byte) 3));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    yce0 yce0Var = (yce0) arrayList.get(size);
                    yce0Var.d = true;
                    for (int i = 0; i < yce0Var.a.countActions(); i++) {
                        String action = yce0Var.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                yce0 yce0Var2 = (yce0) arrayList2.get(size2);
                                if (yce0Var2.b == broadcastReceiver) {
                                    yce0Var2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package p;

import android.net.http.QuicException;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w74 implements jn10 {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof QuicException;
    }

    public void i(boolean z) {
        HashSet hashSet;
        switch (this.a) {
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (z) {
                    fkj0 fkj0Var = fkj0.b;
                    try {
                        if (!dhn.a.contains(fkj0.class)) {
                            try {
                                wf10.c().execute(new k((byte) 12));
                            } catch (Exception unused) {
                                wf10 wf10Var = wf10.a;
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        dhn.a(fkj0.class, th);
                        return;
                    }
                }
                break;
            default:
                if (z) {
                    t4a t4aVar = t4a.a;
                    Set set = dhn.a;
                    if (!set.contains(t4a.class)) {
                        try {
                            if (!t4a.b) {
                                t4a t4aVar2 = t4a.a;
                                if (!set.contains(t4aVar2)) {
                                    try {
                                        c120 c120VarK = g120.k(wf10.b(), false);
                                        if (c120VarK != null) {
                                            JSONArray jSONArray = c120VarK.s;
                                            HashSet hashSet2 = null;
                                            try {
                                                if (!set.contains(t4aVar2)) {
                                                    try {
                                                        hashSet = fpi1.e(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused2) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                }
                                            } catch (Throwable th2) {
                                                dhn.a(t4aVar2, th2);
                                            }
                                            t4a.c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th3) {
                                        dhn.a(t4aVar2, th3);
                                    }
                                }
                                t4a.b = !t4a.c.isEmpty();
                            }
                        } catch (Throwable th4) {
                            dhn.a(t4a.class, th4);
                        }
                        break;
                    }
                }
                break;
        }
    }
}

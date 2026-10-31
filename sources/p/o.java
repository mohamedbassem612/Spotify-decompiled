package p;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class o {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (dhn.a.contains(o.class)) {
            return;
        }
        try {
            if (fpi1.v()) {
                return;
            }
            File fileI = fap1.i();
            final byte b = 0;
            if (fileI == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileI.listFiles((FilenameFilter) new yin((byte) 3));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(v9p1.K(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((ep80) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            final List listA1 = o7h.a1(arrayList2, new m(b));
            JSONArray jSONArray = new JSONArray();
            lr80 it = yoi1.Q(0, Math.min(listA1.size(), 5)).iterator();
            while (((sr80) it).c) {
                jSONArray.put(listA1.get(it.nextInt()));
            }
            fap1.o("anr_reports", jSONArray, new id50() { // from class: p.n
                @Override // p.id50
                public final void a(pd50 pd50Var) {
                    JSONObject jSONObject;
                    JSONObject jSONObject2;
                    byte b2 = b;
                    List list = listA1;
                    switch (b2) {
                        case 0:
                            if (!dhn.a.contains(o.class)) {
                                try {
                                    if (pd50Var.c == null && (jSONObject2 = pd50Var.d) != null && jSONObject2.getBoolean("success")) {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            fap1.g(((ep80) it2.next()).a);
                                        }
                                        break;
                                    }
                                } catch (JSONException unused) {
                                    return;
                                } catch (Throwable th) {
                                    dhn.a(o.class, th);
                                }
                            }
                            break;
                        default:
                            try {
                                if (pd50Var.c == null && (jSONObject = pd50Var.d) != null && jSONObject.getBoolean("success")) {
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        fap1.g(((ep80) it3.next()).a);
                                    }
                                    break;
                                }
                            } catch (JSONException unused2) {
                                return;
                            }
                            break;
                    }
                }
            });
        } catch (Throwable th) {
            dhn.a(o.class, th);
        }
    }
}

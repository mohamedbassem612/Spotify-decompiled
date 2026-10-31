package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Process;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pw3 {
    public final LinkedHashMap a;

    static {
        new e4x0((byte) 28);
    }

    public pw3(t380 t380Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = t380Var.iterator();
        while (it.hasNext()) {
            r7h.W(((qw3) it.next()).a(), arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String strA = ((jx3) obj).b().a();
            Object objH = linkedHashMap.get(strA);
            if (objH == null) {
                objH = cfm0.h(strA, linkedHashMap);
            }
            ((List) objH).add(obj);
        }
        this.a = linkedHashMap;
    }

    public final boolean a(Context context, szc szcVar) {
        if (1000 != szcVar.b() && Process.myUid() != szcVar.b()) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(szcVar.a(), 64);
                packageInfo.getClass();
                Signature[] signatureArr = packageInfo.signatures;
                signatureArr.getClass();
                if (signatureArr.length != 1) {
                    Logger.k("MBS: Caller has more than one signature certificate!", new Object[0]);
                    return false;
                }
                Signature[] signatureArr2 = packageInfo.signatures;
                signatureArr2.getClass();
                String strEncodeToString = Base64.encodeToString(signatureArr2[0].toByteArray(), 2);
                Signature[] signatureArr3 = packageInfo.signatures;
                signatureArr3.getClass();
                String strU = gto1.u(signatureArr3[0].toByteArray());
                LinkedHashMap linkedHashMap = this.a;
                List list = (List) linkedHashMap.get(strEncodeToString);
                List list2 = z6x.a;
                if (list == null) {
                    list = list2;
                }
                List list3 = (List) linkedHashMap.get(strU);
                if (list3 != null) {
                    list2 = list3;
                }
                ArrayList<jx3> arrayListN0 = o7h.N0(list2, list);
                if (!arrayListN0.isEmpty()) {
                    StringBuilder sb = new StringBuilder(10);
                    for (jx3 jx3Var : arrayListN0) {
                        if (!jx3Var.c(szcVar.c(), szcVar.a())) {
                            sb.append(jx3Var.a());
                            sb.append(' ');
                        }
                    }
                    Logger.k("MBS: Caller has a valid certificate, but its package doesn't match any expected package. Caller's package is %s. Expected packages as defined in XML are [%s]. Certificate (sha256): %s", new Object[]{szcVar.a(), sb.toString(), strU});
                    return false;
                }
                if (linkedHashMap.isEmpty()) {
                    Logger.k("MBS: The list of valid certificates is empty. Either your res/xml/allowed_media_browser_callers.xml and res/xml/allowed_media_browser_callers_v2.xml files are empty or there was an error while reading them. Check previous log messages.", new Object[0]);
                }
                if (!e4x0.s0(context, szcVar.a())) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Logger.l(e, "MBS: Package manager can't find package: %s", new Object[]{szcVar.a()});
                return false;
            }
        }
        return true;
    }
}

package p;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e1d {
    public final Context a;
    public final fdc b;
    public final ly8 c;
    public final w4d d;
    public final d4d e;
    public final ArrayList f;
    public final oju g;
    public final long h;
    public final HashMap i = new HashMap();

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.InitializationException */
    public e1d(Context context, ly8 ly8Var, u4d u4dVar, long j) throws InitializationException {
        String strO;
        this.a = context;
        this.c = ly8Var;
        d4d d4dVarA = d4d.a(context, ly8Var.b);
        this.e = d4dVarA;
        this.g = oju.b(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) d4dVarA.a.b).getCameraIdList());
                if (u4dVar == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strO = wqn1.o(d4dVarA, u4dVar.b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strO = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strO)) {
                            arrayList2.add(b(str));
                        }
                    }
                    Iterator it2 = u4dVar.a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((l3d) it2.next()).b());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList) {
                    if (str2.equals("0") || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (j2h1.x(str2, this.e)) {
                        arrayList3.add(str2);
                    } else {
                        j2h1.o("Camera2CameraFactory");
                    }
                }
                this.f = arrayList3;
                fdc fdcVar = new fdc(this.e);
                this.b = fdcVar;
                w4d w4dVar = new w4d(fdcVar);
                this.d = w4dVar;
                ((ArrayList) fdcVar.c).add(w4dVar);
                this.h = j;
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.CameraUnavailableException */
    public final p1d a(String str) throws CameraUnavailableException {
        if (!this.f.contains(str)) {
            hhg1.n("The given camera id is not on the available camera id list.");
            return null;
        }
        s1d s1dVarB = b(str);
        ly8 ly8Var = this.c;
        return new p1d(this.a, this.e, str, s1dVarB, this.b, this.d, ly8Var.a, ly8Var.b, this.g, this.h);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.CameraUnavailableException */
    public final s1d b(String str) throws CameraUnavailableException {
        HashMap map = this.i;
        try {
            s1d s1dVar = (s1d) map.get(str);
            if (s1dVar != null) {
                return s1dVar;
            }
            s1d s1dVar2 = new s1d(str, this.e);
            map.put(str, s1dVar2);
            return s1dVar2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }
}

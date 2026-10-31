package p;

import androidx.camera.core.impl.DeferrableSurface;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class p4u implements qiw, gka1, a420, ci7 {
    public final /* synthetic */ ArrayList a;

    public n8d0 apply(Object obj) {
        List list = (List) obj;
        Objects.toString(list);
        j2h1.o("SyncCaptureSessionBase");
        if (list.isEmpty()) {
            return new e280(new IllegalArgumentException("Unable to open capture session without surfaces"), (byte) 1);
        }
        if (!list.contains(null)) {
            return poz0.B(list);
        }
        return new e280(new DeferrableSurface.SurfaceClosedException("Surface closed", (j2t) this.a.get(list.indexOf(null))), (byte) 1);
    }

    public void b(File file) {
        HashMap map;
        HashMap map2;
        vhm0 vhm0Var;
        HashMap map3;
        HashMap map4 = vhm0.m;
        if (dhn.a.contains(mpi1.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i = byteBufferWrap.getInt();
                int i2 = i + 4;
                if (iAvailable >= i2) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, nne.a));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = jSONArrayNames.getString(i3);
                    }
                    f46.E0(strArr);
                    map = new HashMap();
                    for (int i4 = 0; i4 < length; i4++) {
                        String str = strArr[i4];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i5 = 1;
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = jSONArray.getInt(i6);
                                iArr[i6] = i7;
                                i5 *= i7;
                            }
                            int i8 = i5 * 4;
                            int i9 = i2 + i8;
                            if (i9 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i2, i8);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                guf0 guf0Var = new guf0(iArr);
                                byteBufferWrap2.asFloatBuffer().get(guf0Var.c, 0, i5);
                                map.put(str, guf0Var);
                                i2 = i9;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            dhn.a(mpi1.class, th);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (dhn.a.contains(vhm0.class)) {
            map3 = null;
        } else {
            try {
                map3 = vhm0.m;
            } catch (Throwable th2) {
                dhn.a(vhm0.class, th2);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            vhm0Var = null;
        } else {
            try {
                vhm0Var = new vhm0(map2);
            } catch (Exception unused2) {
                vhm0Var = null;
            }
        }
        if (vhm0Var != null) {
            for (cim0 cim0Var : this.a) {
                StringBuilder sb = new StringBuilder(cim0Var.a);
                sb.append('_');
                String strJ = gvg.j(sb, cim0Var.d, "_rule");
                String str3 = cim0Var.c;
                x8a0 x8a0Var = new x8a0(cim0Var, vhm0Var, (byte) 22);
                File file2 = new File(mpi1.b(), strJ);
                if (str3 == null || file2.exists()) {
                    x8a0Var.b(file2);
                } else {
                    new b420(str3, file2, x8a0Var).execute(new String[0]);
                }
            }
        }
    }

    public jku i(uk4 uk4Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ex30) it.next()).a(uk4Var));
        }
        return new dx30(arrayList, (byte) 0);
    }

    public void v(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r4u) it.next()).e(obj);
        }
    }
}

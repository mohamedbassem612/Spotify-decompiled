package p;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ok30 implements ao00 {
    public static final tw20 d = new tw20(2);
    public final UUID a;
    public final MediaDrm b;
    public int c;

    public ok30(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = whc.c;
        dm5.n(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(whc.d)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (whc.e.equals(uuid)) {
            HashSet hashSet = hph0.a;
            if ("ASUS_Z00AD".equals(Build.MODEL)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
        }
    }

    public final Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    public final zn00 c() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new zn00(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public final byte[] d() {
        return this.b.openSession();
    }

    public final void e(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    public final void f(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    public final int g() {
        return 2;
    }

    public final void i(final sun sunVar) {
        this.b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: p.nk30
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                nj7 nj7Var = ((cwr) sunVar.b).y;
                nj7Var.getClass();
                nj7Var.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    public final nco j(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i < 27 && Objects.equals(uuid, whc.d)) {
            uuid = whc.c;
        }
        return new mk30(uuid, bArr);
    }

    public final void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    public final void m(byte[] bArr, dbu0 dbu0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                mb4.H(this.b, bArr, dbu0Var);
            } catch (UnsupportedOperationException unused) {
                oon1.H("setLogSessionId failed.");
            }
        }
    }

    public final byte[] o(byte[] bArr, byte[] bArr2) {
        if (whc.d.equals(this.a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(zoi1.v(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                oon1.w("Failed to adjust response data: ".concat(zoi1.v(bArr2)), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[LOOP:2: B:27:0x008e->B:35:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    public final xn00 p(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        w8v w8vVar;
        w8v w8vVar2;
        hmy0 hmy0VarU;
        short s;
        byte[] bArrV;
        hmy0 hmy0VarU2;
        UUID uuid = this.a;
        w8v w8vVar3 = null;
        if (list != null) {
            if (!whc.e.equals(uuid)) {
                w8vVar = (w8v) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        w8vVar = (w8v) list.get(0);
                        break;
                    }
                    w8vVar2 = (w8v) list.get(i2);
                    byte[] bArr3 = w8vVar2.e;
                    bArr3.getClass();
                    hmy0VarU = n3o1.u(bArr3);
                    if (hmy0VarU == null) {
                        s = -1;
                    } else {
                        s = hmy0VarU.b;
                    }
                    if (s == 1) {
                        w8vVar = w8vVar2;
                        break;
                    }
                    i2++;
                }
            } else {
                w8v w8vVar4 = (w8v) list.get(0);
                int i3 = 0;
                int length = 0;
                while (true) {
                    if (i3 < list.size()) {
                        w8v w8vVar5 = (w8v) list.get(i3);
                        byte[] bArr4 = w8vVar5.e;
                        bArr4.getClass();
                        if (Objects.equals(w8vVar5.d, w8vVar4.d) && Objects.equals(w8vVar5.c, w8vVar4.c) && n3o1.u(bArr4) != null) {
                            length += bArr4.length;
                            i3++;
                        } else {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    w8vVar = (w8v) list.get(0);
                                    break;
                                }
                                w8vVar2 = (w8v) list.get(i2);
                                byte[] bArr5 = w8vVar2.e;
                                bArr5.getClass();
                                hmy0VarU = n3o1.u(bArr5);
                                if (hmy0VarU == null) {
                                    s = -1;
                                } else {
                                    s = hmy0VarU.b;
                                }
                                if (s == 1) {
                                    w8vVar = w8vVar2;
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i4 = 0;
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            byte[] bArr7 = ((w8v) list.get(i5)).e;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i4, length2);
                            i4 += length2;
                        }
                        w8vVar = new w8v(w8vVar4.b, w8vVar4.c, w8vVar4.d, bArr6);
                    }
                }
            }
            byte[] bArrM = w8vVar.e;
            bArrM.getClass();
            UUID uuid2 = whc.f;
            if (uuid2.equals(uuid)) {
                byte[] bArrV2 = n3o1.v(uuid, bArrM);
                if (bArrV2 != null) {
                    bArrM = bArrV2;
                }
                izr0 izr0Var = new izr0(bArrM);
                int iS = izr0Var.s();
                short sU = izr0Var.u();
                short sU2 = izr0Var.u();
                if (sU == 1 && sU2 == 1) {
                    short sU3 = izr0Var.u();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strC = izr0Var.C(sU3, charset);
                    if (!strC.contains("<LA_URL>")) {
                        int iIndexOf = strC.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            oon1.H("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strC.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strC.substring(iIndexOf);
                        int i6 = iS + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i6);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i6);
                        byteBufferAllocate.putShort(sU);
                        byteBufferAllocate.putShort(sU2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrM = byteBufferAllocate.array();
                    }
                } else {
                    oon1.A("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM = n3o1.m(uuid2, (UUID[]) null, bArrM);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 27 && Objects.equals(uuid, whc.d) && (hmy0VarU2 = n3o1.u(bArrM)) != null) {
                bArrM = n3o1.m(whc.c, hmy0VarU2.d, hmy0VarU2.c);
            }
            HashSet hashSet = hph0.a;
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if (("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) && (bArrV = n3o1.v(uuid, bArrM)) != null) {
                    bArrM = bArrV;
                }
            }
            String str4 = w8vVar.d;
            str = (i7 < 26 && whc.d.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
            bArr2 = bArrM;
            w8vVar3 = w8vVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm mediaDrm = this.b;
        MediaDrm.KeyRequest keyRequest = mediaDrm.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (whc.d.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = zoi1.v(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = mediaDrm.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && w8vVar3 != null) {
            String str5 = w8vVar3.c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        keyRequest.getRequestType();
        return new xn00(defaultUrl, data);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final boolean q(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(whc.e);
            MediaDrm mediaDrm = this.b;
            if (!zEquals2) {
                zEquals = uuid.equals(whc.d);
            } else if (i >= 37) {
                zEquals = true;
            } else {
                String propertyString = mediaDrm.getPropertyString("version");
                if (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) {
                    zEquals = false;
                } else {
                    zEquals = true;
                }
            }
            if (zEquals) {
                return mb4.E(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, whc.d)) ? uuid : whc.c, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z = !uuid.equals(whc.d);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    public final synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }
}

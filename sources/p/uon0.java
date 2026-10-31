package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uon0 extends apn0 {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uon0(byte b, boolean z) {
        super(z);
        this.r = b;
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                return (Boolean) bundle.get(str);
            case 1:
                return (Float) bundle.get(str);
            case 2:
                return (Integer) bundle.get(str);
            case 3:
                return (Long) bundle.get(str);
            case 4:
                return (Integer) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    @Override // p.apn0
    public final String b() {
        switch (this.r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // p.apn0
    public final Object d(String str) {
        int i;
        long j;
        int i2;
        boolean z = true;
        switch (this.r) {
            case 0:
                if (!str.equals("true")) {
                    if (!str.equals("false")) {
                        hhg1.n("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (nhc1.Y(str, "0x", false)) {
                    String strSubstring = str.substring(2);
                    eth.h(16);
                    i = Integer.parseInt(strSubstring, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 3:
                String strH = nhc1.R(str, "L", false) ? cy30.h(1, 0, str) : str;
                if (nhc1.Y(str, "0x", false)) {
                    String strSubstring2 = strH.substring(2);
                    eth.h(16);
                    j = Long.parseLong(strSubstring2, 16);
                } else {
                    j = Long.parseLong(strH);
                }
                return Long.valueOf(j);
            case 4:
                if (nhc1.Y(str, "0x", false)) {
                    String strSubstring3 = str.substring(2);
                    eth.h(16);
                    i2 = Integer.parseInt(strSubstring3, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 1:
                bundle.putFloat(str, ((Number) obj).floatValue());
                break;
            case 2:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            case 3:
                bundle.putLong(str, ((Number) obj).longValue());
                break;
            case 4:
                bundle.putInt(str, ((Number) obj).intValue());
                break;
            default:
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // p.apn0
    public String f(Object obj) {
        switch (this.r) {
            case 5:
                String str = (String) obj;
                String strEncode = str != null ? Uri.encode(str) : null;
                return strEncode == null ? "null" : strEncode;
            default:
                return super.f(obj);
        }
    }
}

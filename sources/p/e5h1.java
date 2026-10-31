package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e5h1 extends apn0 {
    public static final e5h1 s = new e5h1(0, false);
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5h1(byte b, boolean z) {
        super(z);
        this.r = b;
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        switch (this.r) {
            case 0:
                return null;
            case 1:
                Object obj = bundle.get(str);
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                return null;
            case 2:
                Object obj2 = bundle.get(str);
                if (obj2 instanceof Double) {
                    return (Double) obj2;
                }
                return null;
            case 3:
                return (Double) bundle.get(str);
            case 4:
                Object obj3 = bundle.get(str);
                if (obj3 instanceof Float) {
                    return (Float) obj3;
                }
                return null;
            case 5:
                Object obj4 = bundle.get(str);
                if (obj4 instanceof Integer) {
                    return (Integer) obj4;
                }
                return null;
            case 6:
                Object obj5 = bundle.get(str);
                if (obj5 instanceof Long) {
                    return (Long) obj5;
                }
                return null;
            default:
                String string = bundle.getString(str);
                return string == null ? "null" : string;
        }
    }

    @Override // p.apn0
    public final String b() {
        switch (this.r) {
            case 0:
                return "unknown";
            case 1:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case 5:
                return "integer_nullable";
            case 6:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // p.apn0
    public final Object d(String str) {
        switch (this.r) {
            case 0:
                return "null";
            case 1:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) apn0.l.d(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return (Float) apn0.i.d(str);
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) apn0.b.d(str);
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) apn0.f.d(str);
            default:
                return str;
        }
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.r) {
            case 0:
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    apn0.l.e(bundle, str, bool);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 2:
                Double d = (Double) obj;
                if (d != null) {
                    bundle.putDouble(str, d.doubleValue());
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 3:
                bundle.putDouble(str, ((Number) obj).doubleValue());
                break;
            case 4:
                Float f = (Float) obj;
                if (f != null) {
                    apn0.i.e(bundle, str, f);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                if (num != null) {
                    apn0.b.e(bundle, str, num);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            case 6:
                Long l = (Long) obj;
                if (l != null) {
                    apn0.f.e(bundle, str, l);
                } else {
                    bundle.putSerializable(str, null);
                }
                break;
            default:
                bundle.putString(str, (String) obj);
                break;
        }
    }

    @Override // p.apn0
    public String f(Object obj) {
        switch (this.r) {
            case 7:
                return Uri.encode((String) obj);
            default:
                return super.f(obj);
        }
    }
}

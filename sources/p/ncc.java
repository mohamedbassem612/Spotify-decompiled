package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ncc {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(Boolean.class, new mcc((byte) 0));
        map.put(Integer.class, new mcc((byte) 1));
        map.put(Long.class, new mcc((byte) 2));
        map.put(Double.class, new mcc((byte) 3));
        map.put(String.class, new mcc((byte) 4));
        map.put(String[].class, new mcc((byte) 5));
        map.put(JSONArray.class, new mcc((byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    mcc mccVar = (mcc) a.get(obj.getClass());
                    if (mccVar == null) {
                        tw20.t(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    switch (mccVar.a) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                    }
                                    Object obj2 = jSONArray.get(i);
                                    if (!(obj2 instanceof String)) {
                                        tw20.t(obj2.getClass(), "Unexpected type in an array: ");
                                    }
                                    arrayList.add(obj2);
                                    i++;
                                    break;
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(next, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}

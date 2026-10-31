package p;

import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qzq extends LinkedHashMap {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzq(uq8 uq8Var) {
        super(4, 0.75f, true);
        this.a = (byte) 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Matcher a(Pattern pattern, String str) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof jh5) {
                    return super.containsKey((jh5) obj);
                }
                return false;
            case 1:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            case 6:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            case 7:
                if (obj instanceof String) {
                    return super.containsKey((String) obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Long) {
                    return super.containsValue((Long) obj);
                }
                return false;
            case 1:
                if (obj instanceof aar) {
                    return super.containsValue((aar) obj);
                }
                return false;
            case 6:
                if (obj instanceof Single) {
                    return super.containsValue((Single) obj);
                }
                return false;
            case 7:
                if (obj instanceof cj91) {
                    return super.containsValue((cj91) obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof jh5) {
                    return (Long) super.get((jh5) obj);
                }
                return null;
            case 1:
                if (obj instanceof String) {
                    return (aar) super.get((String) obj);
                }
                return null;
            case 6:
                if (obj instanceof String) {
                    return (Single) super.get((String) obj);
                }
                return null;
            case 7:
                if (obj instanceof String) {
                    return (cj91) super.get((String) obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return !(obj instanceof jh5) ? obj2 : (Long) super.getOrDefault((jh5) obj, (Long) obj2);
            case 1:
                return !(obj instanceof String) ? obj2 : (aar) super.getOrDefault((String) obj, (aar) obj2);
            case 6:
                return !(obj instanceof String) ? obj2 : (Single) super.getOrDefault((String) obj, (Single) obj2);
            case 7:
                return !(obj instanceof String) ? obj2 : (cj91) super.getOrDefault((String) obj, (cj91) obj2);
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if ((obj instanceof jh5) && (obj2 instanceof Long)) {
                    return super.remove((jh5) obj, (Long) obj2);
                }
                return false;
            case 1:
                if ((obj instanceof String) && (obj2 instanceof aar)) {
                    return super.remove((String) obj, (aar) obj2);
                }
                return false;
            case 6:
                if ((obj instanceof String) && (obj2 instanceof Single)) {
                    return super.remove((String) obj, (Single) obj2);
                }
                return false;
            case 7:
                if ((obj instanceof String) && (obj2 instanceof cj91)) {
                    return super.remove((String) obj, (cj91) obj2);
                }
                return false;
            default:
                return super.remove(obj, obj2);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                return super.size() > 128;
            case 1:
                return super.size() > 4;
            case 2:
                return size() > 32;
            case 3:
                return super.size() > 10;
            case 4:
                return super.size() > 10;
            case 5:
                return super.size() > 1000;
            case 6:
                return super.size() > 3;
            case 7:
                return super.size() > 4;
            default:
                return super.size() > 1000;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzq(int i, float f, boolean z, byte b2) {
        super(i, f, z);
        this.a = b2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzq() {
        super(5, 1.0f, true);
        this.a = (byte) 7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof jh5) {
                    return (Long) super.remove((jh5) obj);
                }
                return null;
            case 1:
                if (obj instanceof String) {
                    return (aar) super.remove((String) obj);
                }
                return null;
            case 6:
                if (obj instanceof String) {
                    return (Single) super.remove((String) obj);
                }
                return null;
            case 7:
                if (obj instanceof String) {
                    return (cj91) super.remove((String) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }
}

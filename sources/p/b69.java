package p;

import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b69 implements Function0 {
    public final /* synthetic */ byte a;
    public static final b69 b = new b69(0);
    public static final b69 c = new b69(1);
    public static final b69 d = new b69(2);
    public static final b69 e = new b69(3);
    public static final b69 f = new b69(4);
    public static final b69 g = new b69(5);
    public static final b69 h = new b69(6);
    public static final b69 i = new b69(7);
    public static final b69 t = new b69(8);
    public static final b69 X = new b69(9);

    public /* synthetic */ b69(byte b2) {
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        Class cls = Void.TYPE;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new u7h(z4p1.e(1308617531));
            case 1:
                ybc ybcVar = ybc.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
                serviceLoaderLoad.getClass();
                BuiltInsLoader builtInsLoader = (BuiltInsLoader) o7h.r0(serviceLoaderLoad);
                if (builtInsLoader != null) {
                    return builtInsLoader;
                }
                eg.m("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new u7h(u7h.b);
            case 3:
                ikr ikrVar = new ikr(new voe0("DefaultBuiltIns"));
                ikrVar.c(false);
                return ikrVar;
            case 4:
                mma0[] mma0VarArr = dgt.t;
                return cls;
            case 5:
                Set set = zht.b;
                return z6x.a;
            case 6:
                yhz yhzVar = yhz.a;
                return (ikr) ikr.f.getValue();
            case 7:
                mma0[] mma0VarArr2 = x7a0.g;
                return Collections.singletonMap(l7a0.a, new ghc1("Deprecated in Java"));
            case 8:
                yjj0 yjj0Var = yjj0.a;
                List listL1 = o7h.l1(ServiceLoader.load(zjj0.class, zjj0.class.getClassLoader()));
                if (!listL1.isEmpty()) {
                    return listL1;
                }
                eg.m("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 9:
                oma0 oma0Var = pfb1.a;
                return cls;
            case 10:
                return new Object[6];
            case 11:
                return new Boolean[6];
            case 12:
                throw null;
            case 13:
                return Boolean.FALSE;
            case 14:
                return new Object[12];
            case 15:
                return new List[2];
            case 16:
            default:
                return rih1Var;
        }
    }
}

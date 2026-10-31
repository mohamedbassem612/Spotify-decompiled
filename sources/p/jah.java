package p;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class jah implements zqu, d1i, jgg1, g4u, v0i, jn10 {
    public final /* synthetic */ byte a;

    public /* synthetic */ jah(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static /* synthetic */ void d() throws KotlinNothingValueException {
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void e(int i) {
        throw new AssertionError(i);
    }

    public static /* synthetic */ void g(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    @Override // p.d1i
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // p.jgg1
    public Object apply(Object obj) {
        w4r.b.getClass();
        return xin.a.e((vin) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // p.zqu
    public double c(double d) {
        switch (this.a) {
            case 0:
                return h5p1.m(d);
            case 1:
                return h5p1.n(d);
            case 2:
                float[] fArr = kah.a;
                return kah.b(kah.c, d);
            case 3:
                float[] fArr2 = kah.a;
                return kah.a(kah.c, d);
            case 4:
                float[] fArr3 = kah.a;
                return kah.d(kah.d, d);
            default:
                float[] fArr4 = kah.a;
                return kah.c(kah.d, d);
        }
    }

    @Override // p.jn10
    public void i(boolean z) {
        switch (this.a) {
            case 24:
                if (z) {
                    x9p1.r();
                }
                break;
            case 25:
                if (z) {
                    wm5.H();
                }
                break;
            case 26:
                if (z) {
                    wf10.n = true;
                }
                break;
            case 27:
                if (z) {
                    wf10.o = true;
                }
                break;
            default:
                if (z) {
                    wf10.f133p = true;
                }
                break;
        }
    }

    @Override // p.v0i
    public Object m(dxy dxyVar) {
        switch (this.a) {
            case 19:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 20:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                aob0 aob0Var = ExecutorsRegistrar.a;
                return zch1.a;
        }
    }

    @Override // p.g4u
    public boolean test(Object obj, Object obj2) {
        return !obj2.equals(obj);
    }
}

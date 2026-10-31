package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import p.eg;
import p.f14;
import p.g0i;
import p.h0i;
import p.ihc1;
import p.j2i;
import p.qg;
import p.x7b0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lp/g0i;", "<init>", "()V", "ui-tooling"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewActivity extends g0i {
    public static final /* synthetic */ int U0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String stringExtra;
        Class<?> cls;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        String strA1 = ihc1.a1(stringExtra, '.');
        String strV0 = ihc1.V0(stringExtra, '.', stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            h0i.a(this, new j2i(-840626948, new f14(strA1, strV0, (byte) 24), true));
            return;
        }
        try {
            cls = Class.forName(stringExtra2);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        getIntent().getIntExtra("parameterProviderIndex", -1);
        int i = 0;
        if (cls == null) {
            h0i.a(this, new j2i(-1901447514, new qg(strA1, strV0, new Object[0], (byte) 9), true));
            return;
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (z) {
                        break;
                    }
                } else {
                    Constructor<?> constructor2 = constructors[i];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i++;
                }
                constructor = null;
                break;
            }
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            constructor.newInstance(null);
            throw new ClassCastException();
        } catch (x7b0 unused2) {
            eg.m("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }
}

package p;

import android.text.TextUtils;
import android.view.View;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m7k1 extends o7k1 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7k1(byte b) {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
        this.e = b;
        switch (b) {
            case 1:
                super(R.id.tag_state_description, CharSequence.class, 64, 30);
                break;
            case 2:
                super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                break;
            default:
                break;
        }
    }

    @Override // p.o7k1
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return v7k1.a(view);
            case 1:
                return x7k1.b(view);
            default:
                return Boolean.valueOf(v7k1.b(view));
        }
    }

    @Override // p.o7k1
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                v7k1.f(view, (CharSequence) obj);
                break;
            case 1:
                x7k1.c(view, (CharSequence) obj);
                break;
            default:
                v7k1.e(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p.o7k1
    public final boolean f(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.e) {
            case 0:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                zEquals = o7k1.a((Boolean) obj, (Boolean) obj2);
                break;
        }
        return !zEquals;
    }
}

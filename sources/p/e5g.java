package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e5g extends EncoreButton implements tlv {
    public final /* synthetic */ byte Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e5g(Context context, byte b) {
        super(context, (AttributeSet) null, 2130969226, (eix) null, 8, (DefaultConstructorMarker) null);
        this.Y0 = b;
        switch (b) {
            case 1:
                super(context, (AttributeSet) null, 2130969226, (eix) null, 8, (DefaultConstructorMarker) null);
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                setBackgroundColor(ago1.o(context, 2130968775, 0));
                setTextAppearance(2132018007);
                setTextColor(ago1.o(context, 2130968787, 0));
                setIcon(context.getDrawable(2131231589));
                setIconGravity(3);
                setIconSize((int) getResources().getDimension(2131165843));
                setIconTint(x74.E(context, 2131101376));
                setIconPadding((int) getResources().getDimension(2131165842));
                break;
            default:
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                setBackgroundColor(ago1.o(context, 2130968775, 0));
                setTextAppearance(2132018007);
                setTextColor(ago1.o(context, 2130968787, 0));
                setIcon(context.getDrawable(2131232946));
                setIconGravity(3);
                setIconSize((int) getResources().getDimension(2131165789));
                setIconTint(x74.E(context, 2131103936));
                setIconPadding((int) getResources().getDimension(2131165788));
                break;
        }
    }

    public final void f(Object obj) {
        switch (this.Y0) {
            case 0:
                throw td6.k(obj);
            default:
                pze0.m(obj);
                throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(iu30 iu30Var) {
        switch (this.Y0) {
            case 0:
                setOnClickListener(new v20(iu30Var, (byte) 15));
                break;
            default:
                setOnClickListener(new jn90(iu30Var, (byte) 16));
                break;
        }
    }
}

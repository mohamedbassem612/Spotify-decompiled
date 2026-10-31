package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qob implements isw {
    public final /* synthetic */ byte a;
    public final EncoreTextView b;

    public qob(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                EncoreTextView encoreTextView = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                encoreTextView.setTextAppearance(2132018024);
                int dimension = (int) context.getResources().getDimension(2131165364);
                encoreTextView.setPadding(dimension, 0, dimension, 0);
                encoreTextView.setText(context.getString(2131952723));
                encoreTextView.setContentDescription(context.getString(2131952723));
                this.b = encoreTextView;
                break;
            case 2:
                EncoreTextView encoreTextView2 = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                encoreTextView2.setTextAppearance(2132018024);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165897);
                encoreTextView2.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(2131165899), dimensionPixelSize, context.getResources().getDimensionPixelSize(2131165905));
                encoreTextView2.setTag(2131430997, Boolean.TRUE);
                this.b = encoreTextView2;
                break;
            default:
                EncoreTextView encoreTextView3 = new EncoreTextView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                encoreTextView3.setId(2131427642);
                int dimensionPixelSize2 = encoreTextView3.getResources().getDimensionPixelSize(2131167023);
                encoreTextView3.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                encoreTextView3.setTextAppearance(2132018003);
                this.b = encoreTextView3;
                break;
        }
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        EncoreTextView encoreTextView = this.b;
        switch (b) {
            case 0:
                encoreTextView.setText(((oob) obj).b);
                break;
            case 1:
                String str = (String) obj;
                encoreTextView.setText(str);
                encoreTextView.setContentDescription(str);
                break;
            default:
                encoreTextView.setText((String) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }
}

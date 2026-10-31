package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c2f1 extends z60 {
    public final msi0 b;

    public c2f1(Context context, msi0 msi0Var) {
        super(context);
        this.b = msi0Var;
    }

    public final View c(MenuItem menuItem) {
        Drawable icon = menuItem.getIcon();
        Context context = ((z60) this).a;
        if (icon == null) {
            TextView textView = (TextView) yoi1.w(context, TextView.class, 0);
            textView.setText(menuItem.getTitle());
            v9w0 v9w0VarO = b2u.o(textView);
            Collections.addAll(v9w0VarO.c, textView);
            v9w0VarO.a();
            textView.setOnClickListener(new b2f1(this, menuItem, (byte) 1));
            return textView;
        }
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        stateListAnimatorImageButton.setImageDrawable(menuItem.getIcon());
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        stateListAnimatorImageButton.setContentDescription(menuItem.getTitle());
        stateListAnimatorImageButton.setOnClickListener(new b2f1(this, menuItem, (byte) 0));
        stateListAnimatorImageButton.setOnLongClickListener(new k5f1());
        return stateListAnimatorImageButton;
    }
}

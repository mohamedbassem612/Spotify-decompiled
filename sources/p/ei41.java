package p;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ei41 {
    public final Activity a;
    public final ViewGroup b;
    public final FrameLayout c;
    public final ProgressDialog d;
    public final uw0 e;

    public ei41(Activity activity, ViewGroup viewGroup, LayoutInflater layoutInflater, boolean z, uw0 uw0Var) {
        this.a = activity;
        this.e = uw0Var;
        final byte b = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131624013, viewGroup, false);
        this.b = viewGroup2;
        this.c = (FrameLayout) viewGroup2.findViewById(2131427883);
        uw0Var.i = new WeakReference(this);
        CompositeDisposable compositeDisposable = (CompositeDisposable) uw0Var.b;
        compositeDisposable.b((Disposable) uw0Var.Z);
        compositeDisposable.b((Disposable) uw0Var.Y);
        this.d = new ProgressDialog(activity);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(2131430750);
        g4b1 g4b1Var = new g4b1(activity, j4b1.Q7, activity.getResources().getDimensionPixelSize(2131165277));
        g4b1Var.b(activity.getColor(2131104462));
        imageButton.setImageDrawable(g4b1Var);
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: p.di41
            public final /* synthetic */ ei41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                ei41 ei41Var = this.b;
                switch (b2) {
                    case 0:
                        Activity activity2 = ei41Var.a;
                        activity2.setResult(0);
                        activity2.finish();
                        break;
                    default:
                        ei41 ei41Var2 = (ei41) ((WeakReference) ei41Var.e.i).get();
                        if (ei41Var2 != null) {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.setType("image/*");
                            ei41Var2.a.startActivityForResult(intent, 4567);
                            break;
                        }
                        break;
                }
            }
        });
        Button button = (Button) viewGroup2.findViewById(2131430755);
        final byte b2 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: p.di41
            public final /* synthetic */ ei41 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ei41 ei41Var = this.b;
                switch (b3) {
                    case 0:
                        Activity activity2 = ei41Var.a;
                        activity2.setResult(0);
                        activity2.finish();
                        break;
                    default:
                        ei41 ei41Var2 = (ei41) ((WeakReference) ei41Var.e.i).get();
                        if (ei41Var2 != null) {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.setType("image/*");
                            ei41Var2.a.startActivityForResult(intent, 4567);
                            break;
                        }
                        break;
                }
            }
        });
        if (z) {
            button.setVisibility(8);
            ((TextView) viewGroup2.findViewById(2131431024)).setVisibility(0);
            ((TextView) viewGroup2.findViewById(2131431535)).setText(2131961453);
        }
    }
}

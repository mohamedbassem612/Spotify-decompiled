package p;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class a1d1 extends t2u {
    public Dialog V1;
    public DialogInterface.OnCancelListener W1;
    public AlertDialog X1;

    public static a1d1 i1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        a1d1 a1d1Var = new a1d1();
        zod.t(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        a1d1Var.V1 = dialog;
        if (onCancelListener != null) {
            a1d1Var.W1 = onCancelListener;
        }
        return a1d1Var;
    }

    public final Dialog c1(Bundle bundle) {
        Dialog dialog = this.V1;
        if (dialog != null) {
            return dialog;
        }
        ((t2u) this).M1 = false;
        AlertDialog alertDialog = this.X1;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context contextH0 = h0();
        zod.s(contextH0);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(contextH0).create();
        this.X1 = alertDialogCreate;
        return alertDialogCreate;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.W1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

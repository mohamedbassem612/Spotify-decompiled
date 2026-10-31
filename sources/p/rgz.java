package p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class rgz extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    public static rgz a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        rgz rgzVar = new rgz();
        zod.t(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        rgzVar.a = dialog;
        if (onCancelListener != null) {
            rgzVar.b = onCancelListener;
        }
        return rgzVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        zod.s(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.c = alertDialogCreate;
        return alertDialogCreate;
    }
}

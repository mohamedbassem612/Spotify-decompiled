package p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ge implements id50 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ge(Object obj, Serializable serializable, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // p.id50
    public final void a(pd50 pd50Var) {
        JSONArray jSONArrayOptJSONArray;
        JSONException jSONException;
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                HashSet hashSet = (HashSet) this.c;
                HashSet hashSet2 = (HashSet) this.d;
                HashSet hashSet3 = (HashSet) this.e;
                JSONObject jSONObject = pd50Var.d;
                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String strOptString2 = jSONObjectOptJSONObject.optString("status");
                            if (!fpi1.y(strOptString) && !fpi1.y(strOptString2)) {
                                String lowerCase = strOptString2.toLowerCase(Locale.US);
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        hashSet.add(strOptString);
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    hashSet3.add(strOptString);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                final ppt pptVar = (ppt) this.b;
                final String str = (String) this.c;
                final Date date = (Date) this.d;
                final Date date2 = (Date) this.e;
                if (!pptVar.Z1.get()) {
                    lf10 lf10Var = pd50Var.c;
                    if (lf10Var != null) {
                        FacebookException facebookException = lf10Var.i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        pptVar.l1(facebookException);
                    } else {
                        try {
                            JSONObject jSONObject2 = pd50Var.b;
                            if (jSONObject2 == null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                } catch (JSONException e) {
                                    jSONException = e;
                                    pptVar.l1(new FacebookException(jSONException));
                                }
                            }
                            final String string = jSONObject2.getString("id");
                            final l6s l6sVarP = mod.p(jSONObject2);
                            String string2 = jSONObject2.getString("name");
                            npt nptVar = pptVar.c2;
                            if (nptVar != null) {
                                wvt.a(nptVar.b);
                            }
                            c120 c120VarB = g120.b(wf10.b());
                            if (!u890.j(c120VarB != null ? Boolean.valueOf(c120VarB.c.contains(ai91.d)) : null, Boolean.TRUE) || pptVar.e2) {
                                pptVar.i1(string, l6sVarP, str, date, date2);
                            } else {
                                pptVar.e2 = true;
                                String string3 = pptVar.k0().getString(2131954049);
                                String string4 = pptVar.k0().getString(2131954048);
                                String string5 = pptVar.k0().getString(2131954047);
                                String str2 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                                AlertDialog.Builder builder = new AlertDialog.Builder(pptVar.h0());
                                final byte b = 2;
                                builder.setMessage(string3).setCancelable(true).setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: p.mpt
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) {
                                        pptVar.i1(string, l6sVarP, str, date, date2);
                                    }
                                }).setPositiveButton(string5, new DialogInterface.OnClickListener() { // from class: p.ny9
                                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i2) throws FacebookException {
                                        byte b2 = b;
                                        b7x b7xVar = b7x.a;
                                        Object obj = pptVar;
                                        switch (b2) {
                                            case 0:
                                                it8 it8Var = (it8) ((ix7) obj).d;
                                                i8h1 i8h1Var = (i8h1) it8Var.b;
                                                py9 py9Var = (py9) it8Var.c;
                                                x6h1 x6h1VarC = py9Var.c.c();
                                                x6h1VarC.i.add(new a7h1("dismiss_dialog_button", (String) null, (Integer) null, (String) null, (String) null));
                                                x6h1VarC.j = true;
                                                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
                                                break;
                                            case 1:
                                                ix7 ix7Var = (ix7) obj;
                                                it8 it8Var2 = (it8) ix7Var.d;
                                                i8h1 i8h1Var2 = (i8h1) it8Var2.b;
                                                py9 py9Var2 = (py9) it8Var2.c;
                                                x6h1 x6h1VarC2 = py9Var2.c.c();
                                                x6h1VarC2.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                                                x6h1VarC2.j = true;
                                                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), py9Var2.b, System.currentTimeMillis()), (xj61) null);
                                                Intent intent = new Intent();
                                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                                Activity activity = (Activity) ix7Var.b;
                                                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                                                activity.startActivity(intent);
                                                break;
                                            default:
                                                ppt pptVar2 = (ppt) obj;
                                                View viewJ1 = pptVar2.j1(false);
                                                Dialog dialog = ((t2u) pptVar2).Q1;
                                                if (dialog != null) {
                                                    dialog.setContentView(viewJ1);
                                                }
                                                rye0 rye0Var = pptVar2.f2;
                                                if (rye0Var != null) {
                                                    pptVar2.q1(rye0Var);
                                                }
                                                break;
                                        }
                                    }
                                });
                                builder.create().show();
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                        }
                    }
                    break;
                }
                break;
        }
    }
}

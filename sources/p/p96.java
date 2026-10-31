package p;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p96 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ p96(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        CharSequence charSequenceE1;
        String string2;
        byte b = this.a;
        String str = "";
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) ((ven0) obj).getValue();
                if (editable != null && (string = editable.toString()) != null) {
                    str = string;
                }
                iu30Var.invoke(str);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                mgg mggVar = (mgg) obj;
                if (((mzx) mggVar).a.getSuffixText() == null) {
                    mggVar.d(mggVar.e());
                    break;
                }
                break;
            case 5:
                if (editable != null) {
                    ((y0o) obj).invoke(editable.toString());
                }
                break;
            case 6:
                wyr wyrVar = (wyr) obj;
                if (editable != null && (charSequenceE1 = ihc1.e1(editable)) != null && (!ihc1.y0(charSequenceE1))) {
                    z = true;
                }
                wyrVar.a().e.setEnabled(z);
                b8k1.t(wyrVar.a().e, !z ? ((Context) wyrVar.b).getString(2131960453) : null);
                iu30 iu30Var2 = (iu30) wyrVar.e;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(new lxw0(String.valueOf(editable)));
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            case 11:
                Consumer consumer = ((sj21) obj).b;
                if (editable != null && (string2 = editable.toString()) != null) {
                    str = string2;
                }
                consumer.accept(new hi21(str));
                break;
            case 12:
            case 13:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                textInputLayout.s(!textInputLayout.m2, false);
                if (textInputLayout.t) {
                    textInputLayout.n(editable.length());
                }
                if (textInputLayout.T0) {
                    textInputLayout.t(editable.length());
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        iu30 onTextChanged;
        String string;
        CharSequence charSequenceE1;
        CharSequence charSequence2 = charSequence;
        byte b = this.a;
        String str = "";
        b7x b7xVar = b7x.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                f39 f39Var = (f39) obj;
                if (!f39Var.d && (onTextChanged = f39Var.getOnTextChanged()) != null) {
                    onTextChanged.invoke(String.valueOf(charSequence2));
                    break;
                }
                break;
            case 2:
                ((i69) obj).a();
                break;
            case 3:
                oee oeeVar = (oee) ((h72) obj).h;
                h72 h72Var = oeeVar.a;
                q4e q4eVar = (q4e) h72Var.c;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                oeeVar.f = charSequence2;
                if (charSequence2.length() == 0) {
                    h72Var.N(false, "");
                    List list = q4eVar.e;
                    z6x z6xVar = z6x.a;
                    if (!u890.j(list, z6xVar)) {
                        q4eVar.e = z6xVar;
                        q4eVar.h();
                    }
                } else {
                    List list2 = oeeVar.e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        String str2 = (String) obj2;
                        if (ihc1.S0(str2, oeeVar.f) && !oeeVar.a().contains(str2)) {
                            arrayList.add(obj2);
                        }
                    }
                    h72Var.N(arrayList.isEmpty(), oeeVar.f);
                    if (!u890.j(q4eVar.e, arrayList)) {
                        q4eVar.e = arrayList;
                        q4eVar.h();
                    }
                }
                xid xidVar = oeeVar.c;
                String string2 = oeeVar.f.toString();
                x6h1 x6h1VarC = ((yok0) xidVar.c).b.c();
                x6h1VarC.i.add(new a7h1("user_editpronouns_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) xidVar.b).m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", string2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 7:
                fav favVar = (fav) obj;
                iu30 onTextChanged2 = favVar.getOnTextChanged();
                if (onTextChanged2 != null) {
                    onTextChanged2.invoke(String.valueOf(charSequence2));
                }
                if (charSequence2 != null && charSequence2.length() != 0) {
                    l320 state = favVar.getState();
                    if (state != null) {
                        ArrayList arrayList2 = state.e;
                        if (!arrayList2.isEmpty()) {
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (u890.j(((k320) it.next()).b, charSequence2.toString())) {
                                        if (i3 == charSequence2.length()) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i3 == charSequence2.length()) {
                    }
                    Function0 onUserInput = favVar.getOnUserInput();
                    if (onUserInput != null) {
                        onUserInput.invoke();
                    }
                    break;
                }
                break;
            case 8:
                n830 n830Var = (n830) obj;
                ((EncoreButton) ((kp5) n830Var.g).e).setEnabled((charSequence2 == null || (charSequenceE1 = ihc1.e1(charSequence2)) == null || !(ihc1.y0(charSequenceE1) ^ true)) ? false : true);
                if (!u890.j((String) n830Var.i, String.valueOf(charSequence2))) {
                    xjn0 xjn0Var = (xjn0) n830Var.e;
                    i8h1 i8h1Var = xjn0Var.a;
                    x6h1 x6h1VarC2 = xjn0Var.b.b.c();
                    x6h1VarC2.i.add(new a7h1("name_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "name")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                if (charSequence2 != null && (string = charSequence2.toString()) != null) {
                    str = string;
                }
                n830Var.i = str;
                break;
            case 9:
                ((MessageInputView) obj).V0.invoke(new zzi0(ihc1.e1(String.valueOf(charSequence2)).toString().length() > 0));
                break;
            case 10:
                if (i3 > i2) {
                    OtpInputView otpInputView = (OtpInputView) obj;
                    String strSubstring = charSequence2.toString().substring(i + i2, i + i3);
                    int i5 = OtpInputView.N0;
                    if (strSubstring.length() > 1) {
                        otpInputView.e(strSubstring);
                    } else if (otpInputView.i >= 0 && Pattern.compile("\\d").matcher(strSubstring).matches()) {
                        otpInputView.h(otpInputView.i, strSubstring);
                        int i6 = otpInputView.i;
                        if (i6 >= 0) {
                            if (i6 < 0 || i6 != otpInputView.h - 1) {
                                otpInputView.a(i6 + 1);
                            }
                        }
                    }
                    break;
                }
                break;
            case 12:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.S0.getText();
                searchView.A1 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.w(!zIsEmpty);
                if (searchView.y1 && !searchView.r1 && zIsEmpty) {
                    searchView.X0.setVisibility(8);
                } else {
                    i4 = 8;
                }
                searchView.Z0.setVisibility(i4);
                searchView.s();
                searchView.v();
                if (searchView.n1 != null && !TextUtils.equals(charSequence2, searchView.z1)) {
                    searchView.n1.e(charSequence2.toString());
                }
                searchView.z1 = charSequence2.toString();
                break;
            case 13:
                iu30 onTextChanged3 = ((f8e1) obj).getOnTextChanged();
                if (onTextChanged3 != null) {
                    onTextChanged3.invoke(String.valueOf(charSequence2));
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(Editable editable) {
    }

    private final void i(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}

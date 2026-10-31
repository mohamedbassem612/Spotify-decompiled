package p;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pko0 {
    public final CharSequence a;
    public final long b;
    public final mrs0 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public pko0(CharSequence charSequence, long j, mrs0 mrs0Var) {
        this.a = charSequence;
        this.b = j;
        this.c = mrs0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pko0 pko0Var = (pko0) arrayList.get(i);
            mrs0 mrs0Var = pko0Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = pko0Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", pko0Var.b);
            if (mrs0Var != null) {
                bundle.putCharSequence("sender", mrs0Var.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", oko0.a(rh5.c(mrs0Var)));
                } else {
                    bundle.putBundle("person", mrs0Var.i());
                }
            }
            String str = pko0Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = pko0Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", pko0Var.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        mrs0 mrs0VarA;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                pko0 pko0Var = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            mrs0VarA = mrs0.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            mrs0VarA = rh5.a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            mrs0 mrs0Var = new mrs0();
                            mrs0Var.a = charSequence;
                            mrs0Var.b = null;
                            mrs0Var.c = null;
                            mrs0Var.d = null;
                            mrs0Var.e = false;
                            mrs0Var.f = false;
                            mrs0VarA = mrs0Var;
                        } else {
                            mrs0VarA = null;
                        }
                        pko0 pko0Var2 = new pko0(bundle.getCharSequence("text"), bundle.getLong("time"), mrs0VarA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            pko0Var2.e = string;
                            pko0Var2.f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            pko0Var2.d.putAll(bundle.getBundle("extras"));
                        }
                        pko0Var = pko0Var2;
                    }
                } catch (ClassCastException unused) {
                }
                if (pko0Var != null) {
                    arrayList.add(pko0Var);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        mrs0 mrs0Var = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            messageA = oko0.b(charSequence, j, mrs0Var != null ? rh5.c(mrs0Var) : null);
        } else {
            messageA = nko0.a(charSequence, j, mrs0Var != null ? mrs0Var.a : null);
        }
        String str = this.e;
        if (str != null) {
            nko0.b(messageA, str, this.f);
        }
        if (i >= 28) {
            oko0.c(messageA, this.d);
        }
        return messageA;
    }
}

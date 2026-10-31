package p;

import android.app.Application;
import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rh5 {
    public static mrs0 a(Person person) {
        IconCompat iconCompatJ;
        j7s j7sVar = new j7s();
        j7sVar.k(person.getName());
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompatJ = xzo1.j(icon);
        } else {
            iconCompatJ = null;
        }
        j7sVar.h(iconCompatJ);
        j7sVar.o(person.getUri());
        j7sVar.j(person.getKey());
        j7sVar.g(person.isBot());
        j7sVar.i(person.isImportant());
        return j7sVar.a();
    }

    public static String b() {
        return Application.getProcessName();
    }

    public static Person c(mrs0 mrs0Var) {
        Person.Builder name = new Person.Builder().setName(mrs0Var.d());
        Icon iconV = null;
        if (mrs0Var.b() != null) {
            IconCompat iconCompatB = mrs0Var.b();
            iconCompatB.getClass();
            iconV = xzo1.v(iconCompatB, (Context) null);
        }
        return name.setIcon(iconV).setUri(mrs0Var.e()).setKey(mrs0Var.c()).setBot(mrs0Var.f()).setImportant(mrs0Var.g()).build();
    }
}
